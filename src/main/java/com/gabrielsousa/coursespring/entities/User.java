package com.gabrielsousa.coursespring.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private static final long serivalVersionUID = 1L;

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password2;

    public User() {
    }

    public User(Long id, String name, String email, String phone, String password2) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password2 = password2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
