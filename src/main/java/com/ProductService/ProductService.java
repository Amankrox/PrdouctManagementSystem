package com.ProductService;

import com.ProductEntity.Product;
import com.ProductRepository.ProductRepository;

public class ProductService {
	
	private ProductRepository repo;
	public void  addProduct(Product p) {
		repo.addProduct(p);
	}
	

}
