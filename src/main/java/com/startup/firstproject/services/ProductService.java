package com.startup.firstproject.services;

import java.util.List;
import com.startup.firstproject.model.Product;

public interface ProductService {
	
	Product getSingleProducts(Long id);
	
	List<Product> getAllProducts();

}
