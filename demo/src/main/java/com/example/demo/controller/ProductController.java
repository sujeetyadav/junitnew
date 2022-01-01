package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

@RestController
public class ProductController {

	@GetMapping("/products")
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<>();
		Product p1 = new Product(1, "Prod1");
		Product p2 = new Product(2, "Prod2");
		products.add(p1);
		products.add(p2);
		return products; 
	}
}
