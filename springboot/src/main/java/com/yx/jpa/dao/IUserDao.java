package com.yx.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yx.model.User;

/**
 * 持久层接口
 * @author xinxin
 *  直接继承 JpaRepository
 */
@Repository(value="userDao")
public interface IUserDao  extends JpaRepository<User, Long>{
 
}
