package com.webagent.projects.lovable_clone.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.lovable_clone.dto.subscription.CheckoutRequest;
import com.webagent.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.webagent.projects.lovable_clone.dto.subscription.PortalResponse;
import com.webagent.projects.lovable_clone.dto.subscription.SubscriptionResponse;
import com.webagent.projects.lovable_clone.service.SubscriptionService;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
