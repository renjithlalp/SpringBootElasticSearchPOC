package com.search.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.basic.entity.Product;
import com.search.basic.service.ProductService;

@RestController
@RequestMapping("/apis")
public class ProductController {
	
	@Autowired
	private ProductService prdService;
	
	@GetMapping("/allProducts")
	public Iterable<Product> findAll() {
		return prdService.getProducts();
	}
	
	@PostMapping("/insertProduct")
	public Product insertProduct(@RequestBody Product product) {
		return prdService.addProduct(product);
	}

}
