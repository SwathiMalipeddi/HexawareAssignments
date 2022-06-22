package com.spring.jpa.repository;

import com.spring.jpa.data.App;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<App, String > {
}
