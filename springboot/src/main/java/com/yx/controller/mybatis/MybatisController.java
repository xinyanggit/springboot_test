package com.yx.controller.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yx.model.User;
import com.yx.mybatis.service.IuserMybatisService;

@RestController
@RequestMapping("/user")
public class MybatisController {

	@Autowired
	private  IuserMybatisService mybatisService; 
	
	@RequestMapping("/findUserByName/{name}")
	public List<User> findUserByName(@PathVariable(name="name") String userName) {
		 return  mybatisService.findUserByName(userName) ;
	}
	
	@RequestMapping("/findAll")
	public List<User> findAll() {
		return  mybatisService.findAll() ;
	}
	
}
