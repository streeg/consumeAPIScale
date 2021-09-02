package com.scale.consumeAPI.repository;

import com.scale.consumeAPI.model.PageInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PageRepository extends JpaRepository<PageInfo, Long> {
}
