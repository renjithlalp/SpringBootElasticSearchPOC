package com.search.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.basic.entity.Product;
import com.search.basic.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	public Iterable<Product> getProducts() {
		return productRepo.findAll();
	}

	public Product addProduct(Product product) {
		return productRepo.save(product);
	}

	public Product updateProduct(Product product, int id) {
		Product prd1 = productRepo.findById(id).get();
		prd1.setPrice(product.getPrice());
		return product;
	}

	public void deleteProduct(int id) {
		productRepo.deleteById(id);
	}

}
