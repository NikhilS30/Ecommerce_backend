package com.startup.firstproject.services;

import java.util.List;

import com.startup.firstproject.exceptions.ProductNotFoundException;
import com.startup.firstproject.model.Product;

public interface ProductService {
	
	Product getSingleProducts(Long id) throws ProductNotFoundException;
	
	List<Product> getAllProducts();
	
	Product deleteProduct();

}
