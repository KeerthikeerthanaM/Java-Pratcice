package com.example.demoWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController                       //return string as a response body
public class JDBCController {
	
	
	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	//@ResponseBody                                           controller & response body//rest controller
	public String insert()
	{
		jdbc.execute("insert into newdemo values(6,'mahi')");
		return "Data inserted successfully";
	}
	
	

}
