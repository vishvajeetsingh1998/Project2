package com.grocery.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.entity.Product;
import com.grocery.services.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/shivarest/product")
public class ProductController {

	@Autowired
	private ProductService productservice;

	@PostMapping("/addproduct")
	public String addproduct(@RequestBody Product product) {
		int i = productservice.addnewproduct(product);
		if (i > 0) {
			return "New Product added successfully.";
		} else {
			return "process failed";
		}
	}

	@GetMapping("/viewproductdetail/{productid}")
	public Optional<Product> viewproduct(@PathVariable("productid") int productid) {
		Product product = new Product();
		product.setProductid(productid);
		Optional<Product> productinfo = productservice.viewProductdetails(product);
		return productinfo;

	}

	@PutMapping("/editproductdetail")
	public String editproduct(@RequestBody Product product) {
		boolean p = productservice.editproductdetails(product);
		if (p == true) {
			return "Product details edited successfully.";
		} else {
			return "Product details not edited";
		}
	}

	@DeleteMapping("/deteteproduct/{productid}")
	public String deleteproduct(@PathVariable("productid") int productid) {
		Product productinfo = new Product();
		productinfo.setProductid(productid);
		boolean deleteproduct = productservice.deleteProductdetails(productinfo);
		if (deleteproduct == true) {
			return "Product deleted successfully.";
		} else {
			return "Product is safe";
		}
	}
	
	@GetMapping("/viewallproductdetails")
	public 	List<Product> viewAllProducts()
	{  List<Product> allproductinfo= productservice.viewAllProductInfo();
		return allproductinfo;
		
	}
	@GetMapping("/findproduct/{productid}")
	public Optional<Product> findProduct(@PathVariable("productid") int productid)
	{
		return productservice.findProduct(productid);
	}
}
