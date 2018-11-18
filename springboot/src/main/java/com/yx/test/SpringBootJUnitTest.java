package com.yx.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yx.CustomApplication;
import com.yx.model.User;
import com.yx.mybatis.service.IuserMybatisService;

/**
 * Springboot 整合Junit
 * @author xinxin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=CustomApplication.class) // 属性 用于指定引导类
public class SpringBootJUnitTest {
	
	@Autowired
	private IuserMybatisService  mybatisService ; 
	
	@Test
	public void TestFindAll() {
		List<User> list = mybatisService.findAll();
		System.out.println(list);
	}
	
//	@Autowired
	@Resource
	private Environment env ; // 读取核心文件内容
	@Test
	public void testEnv() {
	System.out.println(env.getProperty("spring.datasource.password"));	
	}
	
}
