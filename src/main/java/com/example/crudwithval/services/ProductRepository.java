package com.example.crudwithval.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudwithval.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
