package com.binaryz.course.repositories;

import com.binaryz.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { // Interface for dependency injection
}
