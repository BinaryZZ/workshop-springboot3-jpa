package com.binaryz.course.repositories;

import com.binaryz.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> { // Interface for dependency injection
}
