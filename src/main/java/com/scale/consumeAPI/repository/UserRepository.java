package com.scale.consumeAPI.repository;

import com.scale.consumeAPI.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
