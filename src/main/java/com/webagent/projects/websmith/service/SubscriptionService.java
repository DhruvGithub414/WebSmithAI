package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.subscription.CheckoutRequest;
import com.webagent.projects.websmith.dto.subscription.CheckoutResponse;
import com.webagent.projects.websmith.dto.subscription.PortalResponse;
import com.webagent.projects.websmith.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
