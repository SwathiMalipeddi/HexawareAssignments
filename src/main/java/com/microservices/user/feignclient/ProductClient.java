package com.microservices.user.feignclient;

import com.microservices.user.dao.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "productClient", url = "${productClient.ribbon.listOfServers}")
public interface ProductClient {

    @GetMapping("/product/{productId}")
    Optional<Product> getProduct(@PathVariable("productId") int productId);

    @GetMapping("/product/findAllProducts")
    Optional<List<Product>> getProducts();



}












