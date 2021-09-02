package com.grocery.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grocery.dao.ProductDAO;
import com.grocery.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productdao;

	@Override
	public int addnewproduct(Product product) {
		int i = 0;
		productdao.save(product);
		i = 1;
		return i;
	}

	@Override
	public Optional<Product> viewProductdetails(Product product) {
		int productid = product.getProductid();
		Optional<Product> productinfo = productdao.findById(productid);
		return productinfo;
	}

	@Override
	public boolean editproductdetails(Product product) {
		boolean p=false;
		productdao.save(product);
		p=true;
		return p;
	}

	@Override
	public boolean deleteProductdetails(Product productinfo) {
	     boolean deleteproduct=false;
	     productdao.deleteById(productinfo.getProductid());
	     deleteproduct=true;
		return deleteproduct;
	}

	@Override
	public List<Product> viewAllProductInfo() {
		List<Product> productsinfo = productdao.findAll();
		return productsinfo;
	}

	@Override
	public Optional<Product> findProduct(int productid) {
		
		return productdao.findById(productid);
	}

}
