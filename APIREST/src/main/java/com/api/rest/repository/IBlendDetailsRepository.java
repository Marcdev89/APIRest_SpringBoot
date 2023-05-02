package com.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.model.BlendDetails;

public interface IBlendDetailsRepository extends JpaRepository<BlendDetails, Long> {

}
