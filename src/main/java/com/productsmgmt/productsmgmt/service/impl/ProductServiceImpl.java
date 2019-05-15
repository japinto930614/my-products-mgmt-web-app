package com.productsmgmt.productsmgmt.service.impl;



import com.productsmgmt.productsmgmt.model.Product;
import com.productsmgmt.productsmgmt.repository.ProductRepository;
import com.productsmgmt.productsmgmt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}


    @Override
    public Product findOne(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public void delete(Long id) { productRepository.delete(id);
    }

	/*
	@Override
	public Product findOne(long pid) {

		return productRepository.findById(pid)
				.orElse(new Product());
		//return productRepository.findOne( pid);
	}

	@Override
	public void delete(Product product) {

		productRepository.delete(product);
	}*/


}
