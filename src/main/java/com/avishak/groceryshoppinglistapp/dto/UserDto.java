package com.avishak.groceryshoppinglistapp.dto;

//import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private Long id;
    //@NotEmpty(message = "Please provide your first name")
    private String firstName;
    //@NotEmpty(message = "Please provide your last name")
    private String lastName;
    //@NotEmpty(message = "Please provide your email")
    private String email;
    //@NotEmpty(message = "Please provide your password")
    private String password;
}
