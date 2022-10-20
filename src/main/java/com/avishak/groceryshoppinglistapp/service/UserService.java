package com.avishak.groceryshoppinglistapp.service;

import com.avishak.groceryshoppinglistapp.dto.UserDto;
import com.avishak.groceryshoppinglistapp.entity.User;

import java.util.List;

/**@author Avishak
 * This interface is the service for the User entity.
 */
public interface UserService {
    void saveUser(UserDto user);
    User findByEmail(String email);
    List<UserDto> findAllUsers();
}
