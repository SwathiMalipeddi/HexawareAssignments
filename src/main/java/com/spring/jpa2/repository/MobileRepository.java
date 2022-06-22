package com.spring.jpa2.repository;

import com.spring.jpa2.data.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {

    Mobile findByMobileName(String mobileName);

}
