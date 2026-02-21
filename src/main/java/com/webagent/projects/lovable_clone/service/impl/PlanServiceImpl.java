package com.webagent.projects.lovable_clone.service.impl;

import org.springframework.stereotype.Service;

import com.webagent.projects.lovable_clone.dto.subscription.PlanResponse;
import com.webagent.projects.lovable_clone.service.PlanService;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
