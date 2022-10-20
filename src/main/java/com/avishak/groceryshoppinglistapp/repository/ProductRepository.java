package com.avishak.groceryshoppinglistapp.repository;

import com.avishak.groceryshoppinglistapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**@author Avishak
 * This interface is the repository for the Product entity.
 * It handles the database operations for the Product entity.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}