package com.binaryz.course.repositories;

import com.binaryz.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> { // Interface for dependency injection
}
