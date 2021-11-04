package com.example.ecommerce.services;

import com.example.ecommerce.models.Products;

import java.util.List;

public interface productService {
     List<Products> getAllMatches();
     Products update(Products products);
     void delete(Long id);
     Products add(Products products);
     Products findById(Long id);

}
