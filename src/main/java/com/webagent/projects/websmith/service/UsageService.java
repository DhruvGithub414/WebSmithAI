package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.subscription.PlanLimitsResponse;
import com.webagent.projects.websmith.dto.subscription.UsageTodayResponse;

public interface UsageService {
    void recordTokenUsage(Long userId, int actualTokens);
    void checkDailyTokensUsage();
}
