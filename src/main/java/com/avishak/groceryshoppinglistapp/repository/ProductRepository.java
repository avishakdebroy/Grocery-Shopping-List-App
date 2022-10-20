package com.avishak.groceryshoppinglistapp.repository;

import com.avishak.groceryshoppinglistapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    void findAllProducts();
}