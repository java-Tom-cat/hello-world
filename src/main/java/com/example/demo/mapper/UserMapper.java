package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
	 List<User> queryAll();
}