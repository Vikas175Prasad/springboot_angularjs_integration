package com.vikas.springbootangularjscrud.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikas.springbootangularjscrud.entities.User;
import com.vikas.springbootangularjscrud.repo.UserRepo;

@Transactional
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public String createUser(User user) {
		
		if(user!=null) {
			userRepo.save(user);
		}
		return null;
	}

}
