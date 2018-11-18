package com.yx.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.yx.model.User;
import com.yx.mybatis.dao.IuserMybatisDao;

@Service(value = "mybatisService")
public class UserMybatisServiceImp implements IuserMybatisService {

	@Autowired
	private IuserMybatisDao userMybatisDao;

	@Override
	public List<User> findUserByName(String userName) {
		return userMybatisDao.findUserByName(userName);
	}

	@Override
	@Cacheable(value="findAllCache") // 标示当前方式使用缓存，存在redis数据库中
	 // value属性标示 存入的key 
	// key 用于指定方法返回key，该属性spring用的。有默认值
	public List<User> findAll() {
		System.out.println("进来一次");
		return userMybatisDao.findAll();
	}

}
