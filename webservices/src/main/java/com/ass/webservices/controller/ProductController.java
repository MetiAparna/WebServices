package com.ass.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ass.webservices.entity.ProductEntity;
import com.ass.webservices.service.imp.ProductServiceImp;


@RestController//create and convert json formate
public class ProductController  {
	
	@Autowired
	private ProductServiceImp productServiceImp;
	
	@PostMapping(value="/saveProduct")
	  public  ProductEntity  saveProduct(@RequestBody ProductEntity  entity) {
		  
		  productServiceImp.saveProduct(entity);
		  
		return entity;
		  
	  }
		
	     @GetMapping(value="/findProductById/{alt_key}")
		public   ProductEntity  findProductById(@PathVariable("alt_key") Long id) {
	    	 
		 return	productServiceImp.findProductById(id);
			
			
		}
	     
		
	     @GetMapping(value="/findAllProduct")
		public List<ProductEntity> findAllProduct() {
		
			return productServiceImp.findAllProduct();
			
		}
		
	     @GetMapping(value="/findProductQuantityById")
		public Integer findProductQuantityById(Long id) {
	    	 
			Integer integer = productServiceImp.findProductQuantityById(id);			
			return integer;
		}
		
	     
		public  ProductEntity deleteProductById(Long id) {
			ProductEntity deleteProductById = productServiceImp.deleteProductById(id);
			return deleteProductById;
		}
		
		public ProductEntity  product(ProductEntity  entity) {
			return null;
		}
		
		public List<ProductEntity> findAllProductSortedByName() {
			
			return null;
		}


}
