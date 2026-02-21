package com.webagent.projects.lovable_clone.service;

import org.jspecify.annotations.Nullable;

import com.webagent.projects.lovable_clone.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
