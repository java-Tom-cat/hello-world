package com.example.demo;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImpl;


public class SpringBootTestApplicationTests {

	//访问数据测试
	
	 @Autowired
	 UserServiceImpl uService;
	@Test
	public void contextLoads() {
	
		List<User> list= uService.queryAll();
		System.out.println(list);
		
	}

}
