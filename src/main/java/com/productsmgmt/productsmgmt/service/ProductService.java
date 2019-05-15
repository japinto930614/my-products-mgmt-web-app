package com.productsmgmt.productsmgmt.service;


import com.productsmgmt.productsmgmt.model.Product;

import java.util.List;

public interface ProductService {
	List<Product> findAll();
	Product save(Product product);
	Product findOne(Long id);
	void delete(Long id);
}
