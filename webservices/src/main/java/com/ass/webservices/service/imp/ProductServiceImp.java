package com.ass.webservices.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ass.webservices.entity.ProductEntity;
import com.ass.webservices.repository.imp.ProductRepositoryImp;
import com.ass.webservices.service.ProductService;

@Service
public class ProductServiceImp implements ProductService
{
	@Autowired
	private ProductRepositoryImp productRegisterImp;

	@Override
	public ProductEntity saveProduct(ProductEntity entity) {
		return productRegisterImp.saveProduct(entity);
		
		}

	@Override
	public ProductEntity findProductById(Long id) {
		return productRegisterImp.findProductById(id) ;
	}

	@Override
	public List<ProductEntity> findAllProduct() {
		
		List<ProductEntity> findAllProduct = productRegisterImp.findAllProduct();
		
		return findAllProduct;
	}

	@Override
	public Integer findProductQuantityById(Long id) {
		return productRegisterImp.findProductQuantityById(id);
	}

	@Override
	public ProductEntity deleteProductById(Long id) {
		return productRegisterImp.deleteProductById(id);
	}

	

	@Override
	public List<ProductEntity> findAllProductSortedByName() {
		
		return productRegisterImp.findAllProduct();
	}

	

}
