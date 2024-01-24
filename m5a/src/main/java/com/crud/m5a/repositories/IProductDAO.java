package com.crud.m5a.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crud.m5a.models.ProductDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO,String>{

}
