package com.gabrielsousa.coursespring.repositories;

import com.gabrielsousa.coursespring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
