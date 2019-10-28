package com.example.demo;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@SpringBootTest
public class SpringBootTestApplicationTests {

	//访问数据测试
	
	@Autowired
	UserService<User>  uService;
	@Test
	public void contextLoads() {
	
		//		List<User> list= uService.queryAll();
		//		System.out.println(list);
		Integer integer1= new Integer(1);
		Integer integer2 = new Integer(1);
		System.out.println(integer1==integer2);
		System.out.println(integer1.equals(integer2));
	}

}
