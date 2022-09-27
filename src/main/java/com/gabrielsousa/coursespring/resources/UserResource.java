package com.gabrielsousa.coursespring.resources;

import com.gabrielsousa.coursespring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(null, "Maria", "maria@gmail.com", "99832-2341", "12345");
        return ResponseEntity.ok().body(u);
    }

}
