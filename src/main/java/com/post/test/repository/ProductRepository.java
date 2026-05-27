package com.post.test.repository;

import com.post.test.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// Q7: Repository with a custom JPQL query using named parameters.
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p where p.price < :price and p.category = :category")
    List<Product> findByPriceLessThanAndCategory(@Param("price") double price, @Param("category") String category);
}
