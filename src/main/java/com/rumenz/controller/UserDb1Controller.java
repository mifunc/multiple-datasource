package com.rumenz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rumenz.entity.db1.User1;
import com.rumenz.mapper.db1.UserMapper1;



@RestController
@RequestMapping("/user1")
public class UserDb1Controller {
	
	
	@Autowired
	private UserMapper1 userMapper;
	
    @GetMapping("/index")
    public String index() {
    	User1 res = userMapper.selectByPrimaryKey(1);
    	return res.toString();
    }
    
}
