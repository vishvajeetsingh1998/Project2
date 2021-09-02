package com.grocery.services;

import java.util.List;
import java.util.Optional;

import com.grocery.entity.Product;

public interface ProductService {

	int addnewproduct(Product product);

	Optional<Product> viewProductdetails(Product product);

	boolean editproductdetails(Product product);

	boolean deleteProductdetails(Product productinfo);

	List<Product> viewAllProductInfo();
	public Optional<Product> findProduct(int productid);
}
