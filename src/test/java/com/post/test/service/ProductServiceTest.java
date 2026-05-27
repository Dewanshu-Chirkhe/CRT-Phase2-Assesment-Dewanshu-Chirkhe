package com.post.test.service;

import com.post.test.entity.Product;
import com.post.test.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

// Q17: JUnit 5 and Mockito test for a simple service method.
@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void shouldReturnProductName() {
        when(productRepository.findById(1L)).thenReturn(Optional.of(new Product("Laptop")));

        Product product = productService.getProductById(1L);

        assertEquals("Laptop", product.getName());
    }
}
