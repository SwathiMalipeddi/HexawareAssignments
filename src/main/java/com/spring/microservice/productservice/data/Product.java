package com.spring.microservice.productservice.data;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="product")
public class Product {

    @Id
    @Column(name= "Product_Id")
    private int productId;

    @Column(name="Product_Name")
    private String productName;

    @Column(name="Price")
    private int price;

}






























