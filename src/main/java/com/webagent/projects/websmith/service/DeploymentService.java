package com.webagent.projects.websmith.service;

import com.webagent.projects.websmith.dto.deploy.DeployResponse;

public interface DeploymentService {

    DeployResponse deploy(Long projectId);

}
