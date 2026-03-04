package com.webagent.projects.websmith.service.impl;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeObject;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import com.webagent.projects.websmith.dto.subscription.CheckoutRequest;
import com.webagent.projects.websmith.dto.subscription.CheckoutResponse;
import com.webagent.projects.websmith.dto.subscription.PortalResponse;
import com.webagent.projects.websmith.entity.Plan;
import com.webagent.projects.websmith.entity.User;
import com.webagent.projects.websmith.error.ResourceNotFoundException;
import com.webagent.projects.websmith.repository.PlanRepository;
import com.webagent.projects.websmith.repository.UserRepository;
import com.webagent.projects.websmith.security.AuthUtil;
import com.webagent.projects.websmith.service.PaymentProcessor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class StripePaymentProcessor implements PaymentProcessor {
    private final AuthUtil authUtil;
    private final PlanRepository planRepository;
    @Value("${client.url}")
    private String frontendUrl;
    private final UserRepository userRepository;
    // connect to cli :
    // stripe listen --forward-to localhost:8080/webhooks/payment \ --events=checkout.session.completed,customer.subscription.created,customer.subscription.updated,customer.subscription.deleted,invoice.paid,invoice.payment_failed
    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request) {
        Plan plan =planRepository.findById(request.planId()).orElseThrow(()->
                new ResourceNotFoundException("Plan", request.planId().toString()));
        Long userId = authUtil.getCurrentUserId();
        User user =userRepository.findById(userId).orElseThrow(()->
                new ResourceNotFoundException("user", userId.toString()));

        var params = SessionCreateParams.builder()
                .addLineItem(
                        SessionCreateParams.LineItem.builder().setPrice(plan.getStripePriceId()).setQuantity(1L).build())
                .setMode(SessionCreateParams.Mode.SUBSCRIPTION)
                .setSubscriptionData(
                        new SessionCreateParams.SubscriptionData.Builder()
                                .setBillingMode(SessionCreateParams.SubscriptionData.BillingMode.builder()
                                        .setType(SessionCreateParams.SubscriptionData.BillingMode.Type.FLEXIBLE)
                                        .build())
                                .build()
                )
                .setSuccessUrl(frontendUrl + "/success.html?session_id={CHECKOUT_SESSION_ID}")
                .setCancelUrl(frontendUrl + "/success.html")
                .putMetadata("user_id", userId.toString())
                .putMetadata("plan_id", plan.getId().toString());

        try{
            String stripCustomerId = user.getStripeCustomerId();
            if(stripCustomerId==null || stripCustomerId.isEmpty()){
                params.setCustomerEmail(user.getUsername());
            }
            else{
                params.setCustomer(stripCustomerId);
            }

            Session session = Session.create(params.build());
            return new CheckoutResponse(session.getUrl());
        }
        catch (StripeException e){
            throw new RuntimeException(e);
        }


    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }

    @Override
    public void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata) {
        log.info("Received webhook event: {}", type);
    }
}
