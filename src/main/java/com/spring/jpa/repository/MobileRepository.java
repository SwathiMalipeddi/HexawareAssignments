package com.spring.jpa.repository;

import com.spring.jpa.data.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {

    Mobile findByMobileName(String mobileName);

}
