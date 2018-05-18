package com.example.mystore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mystore.model.Product;
import com.example.mystore.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> obterTodos() {
		return repository.findAll();
	}

	@Override
	public Product obterPorId(Long id) {
		return repository.findOne(id);
	}

	@Override
	public List<Product> obterPorVenue(String venue) {
		return repository.obterPorVenue("%"+venue+"%");
	}
	
}
