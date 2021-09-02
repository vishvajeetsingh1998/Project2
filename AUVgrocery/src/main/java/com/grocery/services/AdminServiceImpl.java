package com.grocery.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grocery.dao.AdminDAO;
import com.grocery.entity.Admin;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDAO admindao;

	@Override
	public int addNewAdmin(Admin admin) {
		int i = 0;
		admindao.save(admin);
		i = 1;
		return i;
	}

	@Override
	public Optional<Admin> viewAdmindetail(Admin admin) {

		return admindao.findById(admin.getUsername());
	}

	@Override
	public boolean editAdminDetail(Admin admin) {
		boolean b = false;
		admindao.save(admin);
		b = true;
		return b;
	}

	@Override
	public boolean deleteAdminDetails(Admin admin) {
		boolean d = false;
		admindao.deleteById(admin.getUsername());
		d = true;
		return d;
	}

}
