package com.factory.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.factory.model.Users;

@Repository
public class UsersDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Users findByUserName(String userName) {
		Users users = (Users) jdbcTemplate.queryForObject("SELECT * FROM users where username = ? ",
				new Object[] { userName }, new BeanPropertyRowMapper<Users>(Users.class));
 
        return users;
    }
}
