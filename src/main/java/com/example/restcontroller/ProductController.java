package com.example.restcontroller;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.repo.entity.ProductEntity;
import com.example.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@RequestMapping("/insert")
	public String addProduct(@RequestBody ProductEntity product )
	{
		ProductEntity productEntity=product;
	 productService.insert(productEntity);
	 return "Sucessfully added"+""+""+product;
	
	}
	
	 @RequestMapping("/find")
	    public Iterable<ProductEntity> getAllProducts() {
	        return productService.findAll();
	    }
	 
	 @RequestMapping("/{id}")
	    public Optional<ProductEntity> searchProduct(@PathVariable int id) {
	        return productService.find(id);
	    }
	 @RequestMapping(method = RequestMethod.PUT,value ="/update/{id}")
	    public String updateProduct(@RequestBody ProductEntity product) {
	        productService.updateProduct(product);
			return "Item added sucessfully"+product;   
	    }
	 @RequestMapping("/delete/{id}")
	 public String delete(@PathVariable Integer id) {
		 productService.deleteProduct(id);
		return "Sucessfully Deleted Product";
		 
	 }
	 
	
	






}
