package com.post.test.service;

import com.post.test.entity.Product;
import com.post.test.repository.ProductRepository;
import org.springframework.stereotype.Service;

// Q17: Simple service layer used by the Mockito unit test.
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
