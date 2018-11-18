package com.yx.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.yx.model.User;

@Mapper // 必须myabtis 3.3以上才可以
public interface IuserMybatisDao {

	@Select(value="select * from user_springboot t  where t.`name` LIKE '%${value}%'  ")
	public List<User> findUserByName(String userName)  ;

	@Select(value="select * from user_springboot t   ")
	public List<User> findAll()  ;

	
}
