package com.springmvc.springmongodbweb.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.springmongodbweb.models.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	
	Product findBy_id(ObjectId _id);
	
	
}