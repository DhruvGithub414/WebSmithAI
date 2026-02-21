package com.webagent.projects.websmith.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.websmith.dto.subscription.CheckoutRequest;
import com.webagent.projects.websmith.dto.subscription.CheckoutResponse;
import com.webagent.projects.websmith.dto.subscription.PortalResponse;
import com.webagent.projects.websmith.dto.subscription.SubscriptionResponse;
import com.webagent.projects.websmith.service.SubscriptionService;

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
