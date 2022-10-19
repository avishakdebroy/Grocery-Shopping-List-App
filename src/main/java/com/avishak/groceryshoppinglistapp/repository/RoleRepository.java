package com.avishak.groceryshoppinglistapp.repository;

import com.avishak.groceryshoppinglistapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}