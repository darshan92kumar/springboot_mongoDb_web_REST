package com.springmvc.springmongodbweb.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.springmongodbweb.models.Product;
import com.springmvc.springmongodbweb.repositories.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@Autowired
    ProductRepository productRepository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
	  return productRepository.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable("id") ObjectId id) {
	  return productRepository.findBy_id(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyProductById(@PathVariable("id") ObjectId id, @Valid @RequestBody Product product) {
	  product.set_id(id);
	  productRepository.save(product);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Product createProduct(@Valid @RequestBody Product product) {
		product.set_id(ObjectId.get());
		productRepository.save(product);
	  return product;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable ObjectId id) {
		productRepository.delete(productRepository.findBy_id(id));
	}

}
