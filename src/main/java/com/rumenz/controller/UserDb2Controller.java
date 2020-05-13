package com.rumenz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rumenz.entity.db2.User2;
import com.rumenz.mapper.db2.UserMapper2;



@RestController
@RequestMapping("/user2")
public class UserDb2Controller {
	
	
	@Autowired
	private UserMapper2 userMapper;
	
    @GetMapping("/index")
    public String index() {
        
    	User2 res = userMapper.selectByPrimaryKey(1);
    	return res.toString();
    }
    
}
