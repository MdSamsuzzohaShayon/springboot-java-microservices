package com.tss.shayon.product.repository;

import com.tss.shayon.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
 * ===========================================================
 * REPOSITORY IS JUST AN INTERFACE THAT WILL ENFORCE US TO IMPLEMENT CERTAIN RULE
 * */
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
