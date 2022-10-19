package com.avishak.groceryshoppinglistapp.service.Impl;

import com.avishak.groceryshoppinglistapp.entity.Product;
import com.avishak.groceryshoppinglistapp.repository.ProductRepository;
import com.avishak.groceryshoppinglistapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void saveProduct(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public Product findProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteProductById(Long id) {
        this.productRepository.deleteById(id);
    }

}