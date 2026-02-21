package com.webagent.projects.lovable_clone.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.lovable_clone.dto.auth.UserProfileResponse;
import com.webagent.projects.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.webagent.projects.lovable_clone.dto.subscription.UsageTodayResponse;
import com.webagent.projects.lovable_clone.service.UsageService;
import com.webagent.projects.lovable_clone.service.UserService;

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
