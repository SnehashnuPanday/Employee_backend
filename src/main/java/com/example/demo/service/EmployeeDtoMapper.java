package com.example.demo.service;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;

@Component
@Mapper
public interface EmployeeDtoMapper {
	@Mappings({ @Mapping(target = "totalHours", ignore = true) })
	EmployeeDto map(Employee employee);
	List<EmployeeDto> mapList(List<Employee> empList);

}
