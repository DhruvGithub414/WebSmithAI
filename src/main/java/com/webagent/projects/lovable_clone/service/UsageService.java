package com.webagent.projects.lovable_clone.service;

import org.jspecify.annotations.Nullable;

import com.webagent.projects.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.webagent.projects.lovable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
