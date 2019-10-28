package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.User;

public interface UserService<T> {
	
	
   
    public List<T> queryAll();
    List<User> queryById(@Param("id")int id);

}
