package com.spring.microservice.productservice.service;


import com.spring.microservice.productservice.data.Product;
import com.spring.microservice.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("productService")
public class ProductService {

    @Autowired(required=true)
    private ProductRepository productRepository;

    @Transactional
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Transactional
    public List<Product> createProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    public Product readProduct(int productId){
        return productRepository.findById(productId).get();
    }

    public List<Product> readProducts() {
        return productRepository.findAll();
    }


}





















