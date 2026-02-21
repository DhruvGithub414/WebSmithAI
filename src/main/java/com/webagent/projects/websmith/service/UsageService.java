package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.subscription.PlanLimitsResponse;
import com.webagent.projects.websmith.dto.subscription.UsageTodayResponse;

public interface UsageService {
     UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
