package com.example.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeDto;
import com.example.demo.service.UserService;

@RestController
@CrossOrigin
public class EmployeeSearchController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/search")
	public List<EmployeeDto> search() throws SQLException{
		return userService.findAllUsers();
	}
}
