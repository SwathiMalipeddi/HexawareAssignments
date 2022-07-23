package com.spring.microservice.productservice.repository;

import com.spring.microservice.productservice.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product,Integer> {
}





