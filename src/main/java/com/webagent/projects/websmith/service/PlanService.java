package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
     List<PlanResponse> getAllActivePlans();
}
