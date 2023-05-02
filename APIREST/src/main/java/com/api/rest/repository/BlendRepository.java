package com.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.model.Blend;

@Repository
public interface BlendRepository extends JpaRepository<Blend, Long>{

}
