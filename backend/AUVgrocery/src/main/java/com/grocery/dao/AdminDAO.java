package com.grocery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocery.entity.Admin;

@Repository
public interface AdminDAO extends JpaRepository<Admin, String>{

}
