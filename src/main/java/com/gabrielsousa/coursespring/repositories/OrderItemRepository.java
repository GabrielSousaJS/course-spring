package com.gabrielsousa.coursespring.repositories;

import com.gabrielsousa.coursespring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
