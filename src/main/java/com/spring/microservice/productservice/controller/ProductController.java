package com.spring.microservice.productservice.controller;


import com.spring.microservice.productservice.data.Product;
import com.spring.microservice.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){

        return productService.createProduct(product);
    }

    @PostMapping ("/saveProducts")
    public List<Product> saveProducts(@RequestBody List<Product> products){

        return productService.createProducts(products);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable(value = "productId") int productId){
        return productService.readProduct(productId);
    }

    @GetMapping("/findAllProducts")
    public List<Product> getProducts(){

        return productService.readProducts();
    }





}












































