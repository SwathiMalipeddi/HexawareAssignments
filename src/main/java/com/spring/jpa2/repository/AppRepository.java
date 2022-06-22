package com.spring.jpa2.repository;

import com.spring.jpa2.data.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<App, String > {
}
