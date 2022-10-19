package com.avishak.groceryshoppinglistapp.repository;

import com.avishak.groceryshoppinglistapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
