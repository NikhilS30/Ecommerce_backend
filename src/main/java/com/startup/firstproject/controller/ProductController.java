package com.startup.firstproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.firstproject.model.Product;
import com.startup.firstproject.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	// creating a obj of interface that is to be used
	ProductService productService;

	/*
	 * now when spring will create an object of productController class it will
	 * automatically inject of product service see here product service is a
	 * interface and spring will now look whether developer has written any class
	 * special by mentioning @service or not
	 */
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/{id}")
	public Product getSingleProduct(@PathVariable("id") long id) {
		return productService.getSingleProducts(id);
//		return null;
	}

	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
//	@
//	public Product deleteProduct() {
//		
//		return productService.deleteProduct();
//	}
	

}
