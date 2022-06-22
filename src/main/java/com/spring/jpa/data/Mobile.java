package com.spring.jpa.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mobile")
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Mobile_Id")
    private int mobileId;

    @Column(name="Mobile_Company")
    private String mobileCompany;

    @Column(name = "Mobile_Name")
    private String mobileName;

    @OneToMany(targetEntity = App.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "Mob_id", referencedColumnName = "Mobile_Id")
    private List<App> apps;


}
