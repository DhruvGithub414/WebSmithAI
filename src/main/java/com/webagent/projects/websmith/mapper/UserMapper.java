package com.webagent.projects.websmith.mapper;

import com.webagent.projects.websmith.dto.auth.SignupRequest;
import com.webagent.projects.websmith.dto.auth.UserProfileResponse;
import com.webagent.projects.websmith.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);
}
