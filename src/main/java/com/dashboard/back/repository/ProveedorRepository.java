package com.dashboard.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.back.model.Proveedor;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {

}
