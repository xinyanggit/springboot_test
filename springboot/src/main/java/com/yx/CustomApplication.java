package com.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * springboot 的入口
 * @author xinxin
 *
 */

@SpringBootApplication
@EnableCaching //确认使用缓存
public class CustomApplication {

	/**
	 * 默认调用
	 * @param args add by yx
	2018年11月17日
	 */
	 public static void main(String[] args) {
		 SpringApplication.run(CustomApplication.class, args);
	} 
	
	
	 /**
	  * 去掉 启动时候显示的 springboot 
	  * @param args add by yx
	 2018年11月17日
	  */
	/* public static void main(String[] args) {
		 SpringApplication application = new SpringApplication(CustomApplication.class) ;
		 application.setBannerMode(Mode.OFF);
		 application.run(args);
	}*/

}
