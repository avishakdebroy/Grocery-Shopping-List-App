package com.avishak.groceryshoppinglistapp.service;

import com.avishak.groceryshoppinglistapp.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
    void saveProduct(Product product);
    Product findProductById(Long id);
    void deleteProductById(Long id);
}
