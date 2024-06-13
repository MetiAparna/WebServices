package com.ass.webservices.repository.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ass.webservices.entity.ProductEntity;
import com.ass.webservices.repository.ProductRepository;
import com.mysql.cj.xdevapi.Collection;

@Repository
public class ProductRepositoryImp  implements ProductRepository
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public ProductEntity saveProduct(ProductEntity entity) {
		try {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(entity);
		transaction.commit();
		
		}catch (Exception e) {
			return null;
		}
		//return Collection.EMPTY_LIST;
		return entity;
		
	}

	@Override
	public ProductEntity findProductById(Long id) {
		
		Session session = sessionFactory.openSession();
		ProductEntity productEntity = session.get(ProductEntity.class, id);
		return productEntity;
		
	}

	@Override
	public List<ProductEntity> findAllProduct() {
		Session session = sessionFactory.openSession();
		// session.getClass();
		return null;
		 
		
	}

	@Override
	public Integer findProductQuantityById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductEntity deleteProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
