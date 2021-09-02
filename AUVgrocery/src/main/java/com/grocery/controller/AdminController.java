package com.grocery.controller;

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

import com.grocery.entity.Admin;
import com.grocery.services.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("shivarest/admin")
public class AdminController {

	@Autowired
	private AdminService adminservice;

	@PostMapping("/addadmin")
	public String addnewAdmin(@RequestBody Admin admin) {
		int i = adminservice.addNewAdmin(admin);
		if (i > 0) {
			return "Admin registration successful";
		} else {
			return "Admin registration fail";
		}

	}

	@GetMapping("/viewadmindetail/{username}")
	public Optional<Admin> viewAdmin(@PathVariable("username") String username) {
		Admin admin = new Admin();
		admin.setUsername(username);
		Optional<Admin> admininfo = adminservice.viewAdmindetail(admin);
		return admininfo;
	}

	@PutMapping("/editadmindetails")
	public String editAdmin(@RequestBody Admin admin) {
		boolean a = adminservice.editAdminDetail(admin);
		if (a == true) {
			return "Admin details edited successfully.";
		} else {
			return "Admin details not edited.";
		}
	}
	
	@DeleteMapping("/deleteadmin/{username}")
	public String deleteAdmin(@PathVariable("username") String username)
	{    Admin admin = new Admin();
	     admin.setUsername(username);
		boolean d=adminservice.deleteAdminDetails(admin);
		if(d==true)
		{
			return "Admin profile deleted successfully.";
		}
		else 
		{
			return "Admin profile is safe.";
		}
	}

}
