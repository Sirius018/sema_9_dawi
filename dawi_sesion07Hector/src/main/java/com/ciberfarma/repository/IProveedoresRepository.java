package com.ciberfarma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciberfarma.model.Proveedor;

public interface IProveedoresRepository extends JpaRepository<Proveedor, Integer> {
	
}
