package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserServiceImpl;

@Controller
@ResponseBody
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/test")//test为jsp文件名
	public ModelAndView select(HttpSession session,HttpServletRequest rep) {
		List<User> list=userMapper.queryAll();
		session.setAttribute("list",list);
		//跳转jsp页面
		// return userMapper.queryAll().toString();
		
		ModelAndView mView=new ModelAndView();
		
		return mView;
	}
	
	 @Autowired
	 UserServiceImpl uService;
	
	@RequestMapping("/select")
	public User query(HttpSession session) {
		List<User> list=uService.queryById(4);
		session.setAttribute("list",list);
		return list.get(2);
	}
	
}
