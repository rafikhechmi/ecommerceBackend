package com.example.ecommerce.serviesImpl;
import com.example.ecommerce.models.Products;
import com.example.ecommerce.repositories.ProductRepository;
import com.example.ecommerce.services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl  implements productService {
    @Autowired
    public ProductRepository ProductRepository;
    @Override
    public List<Products> getAllMatches() {
        return ProductRepository.findAll() ;
    }
    @Override
    public Products update(Products products) {
        return ProductRepository.save(products);
    }
    @Override
    public void delete(Long id) {
        ProductRepository.deleteById(id);
    }
    @Override
    public Products add(Products products) {
        return ProductRepository.save(products);
    }
    @Override
    public Products findById(Long id) {
        Optional<Products> Products = ProductRepository.findById(id);
        return Products.isEmpty() ? null : Products.get();
    }
}
