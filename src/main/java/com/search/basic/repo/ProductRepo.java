package com.search.basic.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.search.basic.entity.Product;

public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {

}