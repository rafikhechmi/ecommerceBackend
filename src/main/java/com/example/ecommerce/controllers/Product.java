package com.example.ecommerce.controllers;

import com.example.ecommerce.models.Products;
import com.example.ecommerce.services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/Product")
public class Product {
    @Autowired
    private productService productService;

    @GetMapping("")
    public List<Products> getAllProducts(){
        return productService.getAllMatches();
    }
    @PutMapping("/{id}")
    public Products update(@PathVariable Long id ,@RequestBody Products products) {
        return productService.update(products);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
    @PostMapping
    public Products add(@RequestBody Products products) {
        return productService.add(products);
    }
    @GetMapping("/{id}")
    public Products getProductsById(@PathVariable Long id) {
        return productService.findById(id);
    }




}
