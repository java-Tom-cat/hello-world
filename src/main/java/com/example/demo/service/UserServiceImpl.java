package com.example.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService<User> {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
    
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		String sqlString="select * from user";
		
		//利用JdbcTemplate进行数据访问
	    @SuppressWarnings("unused")
		List<User> uList1=jdbcTemplate.query(sqlString,new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs,int row) throws SQLException {
				
				User user=new User(rs.getInt("id"),rs.getString("name"),rs.getString("password"));
			    return user;
			}
		
		});
	    
	    //利用UserMapper进行数据访问
	    List<User> uList=userMapper.queryAll();
		return uList;
	}

}
