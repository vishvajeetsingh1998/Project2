package com.grocery.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grocery.dao.UserDAO;
import com.grocery.entity.User;
import com.grocery.services.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO ud;

	@Override
	public int createprofile(User user) {
		int i=0;
		ud.save(user);
		i=1;
		return i;
	}

	@Override
	public User viewUserProfile(User u) {
		User userdetail=ud.findByemail(u.getEmail());
		
		return userdetail;
	}

	@Override
	public boolean editUserProfile(User user) {
		boolean update=false;
		ud.save(user);
		update=true;
		return update;
	}

	@Override
	public boolean deleteUserProfile(String email) {
		boolean delete=false;
		ud.deleteById(email);
		delete=true;
		return delete;
	}

	@Override
	public boolean FindbyIdandPwd(String email, String password) {
		 List<User> L1=ud.FindbyIdandPwd(email, password);
		 if(!L1.isEmpty())
		 {return true;}
		 else 
			 return false;
	}

}
