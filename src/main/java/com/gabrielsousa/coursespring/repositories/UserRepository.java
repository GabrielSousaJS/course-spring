package com.gabrielsousa.coursespring.repositories;

import com.gabrielsousa.coursespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
