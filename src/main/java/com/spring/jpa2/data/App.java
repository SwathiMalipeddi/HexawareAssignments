package com.spring.jpa2.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app")
public class App {

    @Id
    @Column(name="App_Name")
    private String appName;

}
