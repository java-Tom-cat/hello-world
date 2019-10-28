package com.example.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
	 List<User> queryAll();
    @Select("SELECT * FROM user where id<#{id}")
	 List<User> queryById(@Param("id")int id);
}