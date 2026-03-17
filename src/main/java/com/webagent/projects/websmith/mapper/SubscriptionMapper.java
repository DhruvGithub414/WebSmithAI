package com.webagent.projects.websmith.mapper;

import com.webagent.projects.websmith.dto.subscription.PlanResponse;
import com.webagent.projects.websmith.dto.subscription.SubscriptionResponse;
import com.webagent.projects.websmith.entity.Plan;
import com.webagent.projects.websmith.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse (Plan plan);
}
