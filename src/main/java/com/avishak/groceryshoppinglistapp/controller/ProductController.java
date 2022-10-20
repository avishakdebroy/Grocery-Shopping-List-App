package com.avishak.groceryshoppinglistapp.controller;

import com.avishak.groceryshoppinglistapp.entity.Product;
import com.avishak.groceryshoppinglistapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String viewProductPage(Model model) {
        model.addAttribute("listProducts", productService.findAllProducts());
        return "products";
    }

    @GetMapping("/add")
    public String addProductForm(Model model) {
        Product Product = new Product();
        model.addAttribute("product", Product);
        return "add_product";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/update/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Product product = productService.findProductById(id);
        model.addAttribute("product", product);
        return "update_product";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(value = "id") long id) {
        this.productService.deleteProductById(id);
        return "redirect:/products";
    }
}