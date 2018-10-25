package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;

@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, String> {

    List<Employee> findByProject(String project);
}