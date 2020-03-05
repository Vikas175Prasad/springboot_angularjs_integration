package com.vikas.springbootangularjscrud.restcontrollers;

import java.awt.PageAttributes.MediaType;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vikas.springbootangularjscrud.entities.User;
import com.vikas.springbootangularjscrud.services.UserService;
import com.vikas.springbootangularjscrud.services.UserServiceImpl;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;

	@RequestMapping(value = "/addUser",method = RequestMethod.POST, produces = "application/json")
	public HashMap<String,String> createUser(@RequestBody User user){
		
			userServiceImpl.createUser(user);
			HashMap<String,String>  re = new HashMap<>();
			re.put("message", "success");
			return re;

	}
	
}
