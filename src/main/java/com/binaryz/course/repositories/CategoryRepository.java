package com.binaryz.course.repositories;

import com.binaryz.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> { // Interface for dependency injection
}
