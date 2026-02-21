package com.webagent.projects.websmith.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.websmith.dto.subscription.PlanLimitsResponse;
import com.webagent.projects.websmith.dto.subscription.UsageTodayResponse;
import com.webagent.projects.websmith.service.UsageService;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
