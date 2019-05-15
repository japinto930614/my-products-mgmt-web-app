package com.productsmgmt.productsmgmt.repository;

import com.productsmgmt.productsmgmt.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {
}

