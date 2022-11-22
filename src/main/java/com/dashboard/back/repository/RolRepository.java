package com.dashboard.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.back.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{

}
