package com.grocery.controller;

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

import com.grocery.entity.User;
import com.grocery.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/shivarest/user")
public class UserController {

	@Autowired
	private UserService us;

	@PostMapping("/adduser")
	public String addUser(@RequestBody User user) {

		int i = us.createprofile(user);
		if (i > 0) {
			return "registration successful";
		} else {
			return "registration fail";
		}
	}

	@GetMapping("/userdetails/{email}")
	public User view(@PathVariable("email") String email) {
		User u = new User();
		u.setEmail(email);
		User userdetail = us.viewUserProfile(u);

		return userdetail;

	}

	@PutMapping("/edituserdetail")
	public String edit(@RequestBody User user) {
		boolean b = us.editUserProfile(user);
		if (b == true) {
			return "Profile edited Successfully";
		} else {
			return "Profile not edited";
		}
	}
	
	@DeleteMapping("/deteteuserdetails/{email}")
	public String delete(@PathVariable("email") String email)
	{
		boolean b=us.deleteUserProfile(email);
		if(b==true)
		{
			return "Profile deleted Successfully";
		}
		else
		{
			return "Profile is safe";
		}
	}
	@GetMapping("login/{email}/{password}")
	public boolean  FindbyIdandPwd(@PathVariable("email")String email,@PathVariable("password")String password){
		return us.FindbyIdandPwd(email, password);
	}

}
