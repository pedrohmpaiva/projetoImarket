package com.example.Dao;

import java.util.List;

import com.example.demo.domain.Admin;

public interface AdDao {
	public interface CargoDao {

		   void save(Admin admin );

		    void update(Admin admin);

		    void delete(Long id);

		    Admin findById(Long id);

		    List<Admin> findAll();
	}


}
