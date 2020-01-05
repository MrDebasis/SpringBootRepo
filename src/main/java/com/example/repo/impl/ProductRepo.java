package com.example.repo.impl;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.repo.entity.ProductEntity;

@Repository
public interface ProductRepo extends CrudRepository<ProductEntity, Integer>{

	



	
}
