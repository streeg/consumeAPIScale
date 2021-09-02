package com.scale.consumeAPI.repository;

import com.scale.consumeAPI.model.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
