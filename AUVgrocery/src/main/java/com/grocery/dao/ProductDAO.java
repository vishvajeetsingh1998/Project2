package com.grocery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocery.entity.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

}
