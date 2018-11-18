package com.yx.mybatis.service;

import java.util.List;

import com.yx.model.User;

public interface IuserMybatisService {
 public List<User>  findUserByName(String userName) ;
 public List<User>  findAll() ;
 
}
