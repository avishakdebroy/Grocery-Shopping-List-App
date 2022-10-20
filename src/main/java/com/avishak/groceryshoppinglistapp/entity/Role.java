package com.avishak.groceryshoppinglistapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "roles")
/**@author Avishak
 * This class is the entity for the Role entity.
 * It contains the attributes of the Role entity.
 */
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}