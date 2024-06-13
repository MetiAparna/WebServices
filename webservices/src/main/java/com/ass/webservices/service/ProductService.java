package com.ass.webservices.service;

import java.util.List;

import com.ass.webservices.entity.ProductEntity;

public interface ProductService {
	
	
	
     public  ProductEntity  saveProduct(ProductEntity  entity);
	
	public   ProductEntity  findProductById(Long id);
	
	public List<ProductEntity> findAllProduct();
	
	public Integer findProductQuantityById(Long id);
	
	public  ProductEntity deleteProductById(Long id);
	
	//public ProductEntity  product(ProductEntity  entity);
	
	public List<ProductEntity> findAllProductSortedByName();


}
