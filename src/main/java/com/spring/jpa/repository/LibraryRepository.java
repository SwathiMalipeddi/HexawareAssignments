package com.spring.jpa.repository;

import com.spring.jpa.data.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
}
