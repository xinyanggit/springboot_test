package com.yx.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yx.jpa.dao.IUserDao;
import com.yx.model.User;

@Service(value="userService")
public class UserServiceImpl implements IUserService{

	@Autowired
    private IUserDao userDao ;
	
	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
