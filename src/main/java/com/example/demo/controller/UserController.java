package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserServiceImpl;

@Controller
@ResponseBody
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/user")
	public String select(HttpSession session) {
		List<User> list=userMapper.queryAll();
		session.setAttribute("list",list);
		 return userMapper.queryAll().toString();
		//return "ok";
	}
	
	 @Autowired
	 UserServiceImpl uService;
	
	@RequestMapping("/select")
	public User query(HttpSession session) {
		List<User> list=uService.queryAll();
		session.setAttribute("list",list);
		return list.get(0);
	}
	
}
