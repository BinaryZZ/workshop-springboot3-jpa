package com.binaryz.course.repositories;

import com.binaryz.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { // Interface for dependency injection
}
