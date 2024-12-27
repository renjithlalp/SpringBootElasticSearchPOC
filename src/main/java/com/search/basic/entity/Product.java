package com.search.basic.entity;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "products")
public class Product {
	
	private int id;
	
	private String name;
	
	private String description;
	
	private int quantity;
	
	private double price;

	
}
