package com.webagent.projects.websmith.service.impl;

import com.webagent.projects.websmith.entity.User;
import com.webagent.projects.websmith.error.BadRequestException;
import com.webagent.projects.websmith.mapper.UserMapper;
import com.webagent.projects.websmith.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.webagent.projects.websmith.dto.auth.AuthResponse;
import com.webagent.projects.websmith.dto.auth.LoginRequest;
import com.webagent.projects.websmith.dto.auth.SignupRequest;
import com.webagent.projects.websmith.service.AuthService;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class AuthServiceImpl implements AuthService {

    UserRepository userRepository;
    UserMapper userMapper;
    PasswordEncoder passwordEncoder;

    @Override
    public AuthResponse signup(SignupRequest request) {
        userRepository.findByUsername(request.username()).ifPresent(
                user->{
                    throw new BadRequestException("User Already exists with username "+request.username());
                }
        );
        User user = userMapper.toEntity(request);
        user.setPassword(passwordEncoder.encode(request.password()));
        user = userRepository.save(user);
        return new AuthResponse("dummy", userMapper.toUserProfileResponse(user));
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
