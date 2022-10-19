package com.avishak.groceryshoppinglistapp.service;

import com.avishak.groceryshoppinglistapp.dto.UserDto;
import com.avishak.groceryshoppinglistapp.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto user);
    User findByEmail(String email);
    List<UserDto> findAllUsers();
}
