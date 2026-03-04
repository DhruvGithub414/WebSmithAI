package com.webagent.projects.websmith.service;

import com.stripe.model.StripeObject;
import com.webagent.projects.websmith.dto.subscription.CheckoutRequest;
import com.webagent.projects.websmith.dto.subscription.CheckoutResponse;
import com.webagent.projects.websmith.dto.subscription.PortalResponse;

import java.util.Map;

public interface PaymentProcessor {

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal(Long userId);

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);
}
