package com.avishak.groceryshoppinglistapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "wishlist")
/**@author Avishak
 * This class is the entity for the Wishlist entity.
 * It contains the attributes of the Wishlist entity.
 */
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id")
    private Long id;
    @Column(nullable = false, name = "product_name")
    private String listName;
    @Column(nullable = true, name = "quantity")
    private Long quantity;
}