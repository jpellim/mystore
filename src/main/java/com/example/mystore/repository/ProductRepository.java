package com.example.mystore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mystore.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
 	
	@Query("SELECT p FROM Product p WHERE p.venue like :venue ")
	List<Product> obterPorVenue(@Param("venue") String venue);
	
}
