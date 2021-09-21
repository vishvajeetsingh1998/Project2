package com.grocery.services;

import com.grocery.entity.User;

public interface UserService {

	int createprofile(User user);

	User viewUserProfile(User u);

	boolean editUserProfile(User user);

	boolean deleteUserProfile(String email);
	public boolean  FindbyIdandPwd(String email, String password);

}
