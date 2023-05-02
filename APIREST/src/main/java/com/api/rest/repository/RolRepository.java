package com.api.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.model.Rol;

@Repository

public interface RolRepository extends JpaRepository<Rol, Long> {

}
