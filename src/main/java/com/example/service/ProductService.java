package com.example.service;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repo.entity.ProductEntity;
import com.example.repo.impl.ProductRepo;

@Transactional
@Service
public class ProductService {
	 @Autowired
	    public ProductRepo productRepository;
	 

	    public String insert(ProductEntity product) {
	        productRepository.save(product);
	        return "sucessfully added";
	    }
	    public Iterable<ProductEntity> findAll() {
	        return productRepository.findAll();
	    }
	    
	    public Optional<ProductEntity> find(int id) {
	        return productRepository.findById(id);
	    }
	    public void updateProduct(ProductEntity product) {
	        productRepository.save(product);
	    }
	    public void deleteProduct(Integer id) {
	        productRepository.deleteById(id);
	    }



}
