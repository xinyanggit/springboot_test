package com.yx.controller.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yx.jpa.service.IUserService;
import com.yx.model.User;

@RestController
@RequestMapping("/user")
public class UserJPAController {
	
	@Autowired
	private  IUserService userService; 
	
	@RequestMapping("/getUserdata")
	public List<User> getUserdata() {
		 return  userService.getUserList() ;
	}
	
}
