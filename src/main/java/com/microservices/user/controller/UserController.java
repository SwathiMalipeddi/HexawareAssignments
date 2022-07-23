package com.microservices.user.controller;

import com.microservices.user.dao.Product;
import com.microservices.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/product/{productId}")
    public Product getProductById(@PathVariable(value = "productId") int productId){
        return userService.readProductById(productId);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){

        return userService.readAllProducts();
    }


}














