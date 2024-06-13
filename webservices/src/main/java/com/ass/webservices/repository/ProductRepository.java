package com.ass.webservices.repository;

import java.util.List;

import com.ass.webservices.entity.ProductEntity;

public interface ProductRepository {
	
	public  ProductEntity  saveProduct(ProductEntity  entity);
	
	public   ProductEntity  findProductById(Long id);
	
	public List<ProductEntity> findAllProduct();
	
	public Integer findProductQuantityById(Long id);
	
	public  ProductEntity deleteProductById(Long id);
	
	//public ProductEntity  product(ProductEntity  entity);
	

	
}
