package com.microservices.user.service;

import com.microservices.user.dao.Product;
import com.microservices.user.feignclient.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private ProductClient productClient;

    public List<Product> readAllProducts(){
        return  productClient.getProducts().get()!=null ?productClient.getProducts().get(): null ;

    }

    public Product readProductById(int productId){
        return productClient.getProduct(productId).get()!=null ?productClient.getProduct(productId).get(): null;

    }

}








