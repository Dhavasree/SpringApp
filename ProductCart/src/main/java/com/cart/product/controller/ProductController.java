package com.cart.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cart.product.dao.ProductDao;
import com.cart.product.model.Product;
import com.cart.product.service.ProductService;

@Controller
public class ProductController {
	ProductService productService;

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping("/findproduct")
	public ModelAndView productCont() {
		System.out.println("check prod");
		ModelAndView modelAndView = new ModelAndView("productlist");
		modelAndView.addObject("productli", productService.findAllProduct());
		return modelAndView;
	}

	@RequestMapping("/saveproduct")
	public ModelAndView productSave(
			@ModelAttribute(value = "product") Product product,
			@RequestParam("model") String model,
			@RequestParam("brand_name") String brand_name,
			@RequestParam("country") String country,
			@RequestParam("price") String price) {
		product.setBrand_name(brand_name);
		product.setCountry(country);
		product.setModel(model);
		product.setPrice(Float.parseFloat(price));

		productService.save(product);
		System.out.println("Added product");
		ModelAndView modelAndView = new ModelAndView("productform");
		modelAndView.addObject("productli", productService.findAllProduct());
		return modelAndView;
	}

	@RequestMapping("/addproduct")
	public ModelAndView productAdd() {
		System.out.println("form product");
		ModelAndView modelAndView = new ModelAndView("productform");
		return modelAndView;

	}

	@RequestMapping("/home")
	public String goBack() {
		return "../index";
	}
}
