package com.avishak.groceryshoppinglistapp.repository;

import com.avishak.groceryshoppinglistapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
