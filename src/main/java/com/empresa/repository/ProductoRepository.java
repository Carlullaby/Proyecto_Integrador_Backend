package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
