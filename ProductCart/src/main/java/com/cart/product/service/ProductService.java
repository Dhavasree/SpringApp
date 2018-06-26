package com.cart.product.service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cart.product.dao.ProductDao;
import com.cart.product.model.Product;

@Service("productService")
public class ProductService {
	private ProductDao productDao;

	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Transactional
	public List<Product> findAllProduct() {
		return productDao.findAll();
	}

	@Transactional
	public void save(Product product) {
		productDao.save(product);
	}
}
