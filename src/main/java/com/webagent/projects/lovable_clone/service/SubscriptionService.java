package com.webagent.projects.lovable_clone.service;

import org.jspecify.annotations.Nullable;

import com.webagent.projects.lovable_clone.dto.subscription.CheckoutRequest;
import com.webagent.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.webagent.projects.lovable_clone.dto.subscription.PortalResponse;
import com.webagent.projects.lovable_clone.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
