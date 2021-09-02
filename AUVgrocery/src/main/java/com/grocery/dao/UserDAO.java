package com.grocery.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grocery.entity.User;
@Repository
public interface UserDAO extends JpaRepository<User, String>{

	public User findByemail(String email);
	@Query("from User u where u.email LIKE ?1 AND u.password LIKE ?2")
	public List<User> FindbyIdandPwd(String email, String password);
}
