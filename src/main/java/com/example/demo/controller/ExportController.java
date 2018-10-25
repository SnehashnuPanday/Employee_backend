package com.example.demo.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.UserService;

@Controller
public class ExportController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

	/**
	 * Handle request to download an Excel document
	 * @throws SQLException 
	 */
	@RequestMapping("/download")
	public String download(Model model) throws SQLException {

		model.addAttribute("users", userService.findAllUsers());
		return "";
	}

}
