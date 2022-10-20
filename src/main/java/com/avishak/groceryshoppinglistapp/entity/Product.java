package com.avishak.groceryshoppinglistapp.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "products")
/**@author Avishak
 * This class is the entity for the Product entity.
 * It contains the attributes of the Product entity.
 */
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;
    @Column(nullable = false, name = "product_name")
    private String name;
    @Column(nullable = false, name = "product_category")
    private String category;
    @Column(nullable = true, name = "product_price")
    private Double price;
    @Column(nullable = true, name = "purchase_date")
    private String purchaseDate;
}
