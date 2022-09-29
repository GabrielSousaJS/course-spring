package com.gabrielsousa.coursespring.repositories;

import com.gabrielsousa.coursespring.entities.Category;
import com.gabrielsousa.coursespring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
