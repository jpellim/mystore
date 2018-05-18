package com.example.mystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mystore.model.Product;
import com.example.mystore.service.ProductService;

@RestController
@RequestMapping("/rest/product")
public class ProductRestController {
	
	@Autowired
	private ProductService service;

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> getAllProducts() {
        
        return new ResponseEntity<List<Product>>(service.obterTodos(), HttpStatus.OK);
    }
    
    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
        
        return new ResponseEntity<Product>(service.obterPorId(id), HttpStatus.OK);
    }
    
    @RequestMapping(path = "/filter/{venue}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> getProductsByVenue(@PathVariable("venue") String venue) {
        
    	List<Product> prods = service.obterPorVenue(venue);    	
        return new ResponseEntity<List<Product>>(prods, HttpStatus.OK);
    }
    
}
