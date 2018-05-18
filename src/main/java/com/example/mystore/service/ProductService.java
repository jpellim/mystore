package com.example.mystore.service;

import java.util.List;

import com.example.mystore.model.Product;

public interface ProductService {

	public List<Product> obterTodos();

	public Product obterPorId(Long id);
	
	public List<Product> obterPorVenue(String venue);

}
