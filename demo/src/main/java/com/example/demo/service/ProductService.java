package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;

@Service
public class ProductService {

	public List<Product> getProducts() {
		List<Product> products = new ArrayList<>();
		Product p1 = new Product(1, "Prod1");
		Product p2 = new Product(2, "Prod2");
		products.add(p1);
		products.add(p2);
		return products; 
	}
}
