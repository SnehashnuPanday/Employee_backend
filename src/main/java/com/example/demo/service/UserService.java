package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.TestDao;
import com.example.demo.model.Employee;
import com.example.demo.service.impl.EmployeeDtoMapperImpl;

@Service
public class UserService {

	@Autowired
	private TestDao testDao;

	@Autowired
	private EmployeeDtoMapperImpl mapper;

	@Autowired
	private EmployeeRepository employeeDao;
	private static final Logger log = LoggerFactory.getLogger(UserService.class);

	public List<EmployeeDto> findAllUsers() throws SQLException {
		List<EmployeeDto> employeeDtoList;
		// testDao.getUserData();
		List<Employee> empList = (List<Employee>) employeeDao.findAll();
		
		for (Employee emp : empList) {
			log.info(emp.toString());
		}
		employeeDtoList = mapper.mapList(empList);
		return employeeDtoList;
	}
}
