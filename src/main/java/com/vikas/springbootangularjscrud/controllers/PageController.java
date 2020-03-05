package com.vikas.springbootangularjscrud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping(value = "/")
	public String indexPage(){
		
		return "index";
		
	}
}
