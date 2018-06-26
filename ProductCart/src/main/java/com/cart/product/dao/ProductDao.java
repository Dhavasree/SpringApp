package com.cart.product.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.activation.DataSource;
import javax.transaction.Transactional;

import com.cart.product.model.Product;

@Repository
public class ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Product> findAll() {
		return this.sessionFactory.getCurrentSession()
				.createQuery("from Product").list();
	}

	@Transactional
	public void save(Product product) {
		this.sessionFactory.getCurrentSession().save(product);
	}
	@SuppressWarnings("deprecation")
	@Transactional
	public void delete(long id) {
		System.out.println("dele");
		Product p=this.sessionFactory.getCurrentSession().load(Product.class, id);
		this.sessionFactory.getCurrentSession().delete(p);
		}
}
