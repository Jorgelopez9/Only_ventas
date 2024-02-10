package com.onlycloths.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlycloths.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	
}
