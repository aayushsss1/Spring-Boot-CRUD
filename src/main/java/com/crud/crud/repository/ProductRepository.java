package com.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
