package com.avishak.groceryshoppinglistapp.service.Impl;

import com.avishak.groceryshoppinglistapp.dto.UserDto;
import com.avishak.groceryshoppinglistapp.entity.User;
import com.avishak.groceryshoppinglistapp.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

//@ExtendWith(MockitoExtension.class)
//class UserServiceImplTest {
//
//            @Mock
//            private UserRepository userRepository;
//
//            private UserServiceImpl underTest;
//
//            @BeforeEach
//            void setUp() {
//                underTest = new UserServiceImpl(userRepository);
//            }
//
//            @Test
//            void itShouldFindAllUsers() {
//                // when
//                underTest.findAllUsers();
//
//                // then
//                verify(userRepository).findAll();
//            }
//
//}
