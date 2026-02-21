package com.webagent.projects.lovable_clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webagent.projects.lovable_clone.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
