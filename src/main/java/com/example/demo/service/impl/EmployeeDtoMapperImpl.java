package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeDto;
import com.example.demo.service.EmployeeDtoMapper;

@Service

public class EmployeeDtoMapperImpl implements EmployeeDtoMapper {

    @Override
    public EmployeeDto map(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId( employee.getEmpId() );
        employeeDto.setSkill( employee.getSkill() );
        employeeDto.setResourceName( employee.getResourceName() );
        employeeDto.setSowName( employee.getSowName() );
        employeeDto.setLocationType( employee.getLocationType() );
        employeeDto.setClientManager( employee.getClientManager() );
        employeeDto.setVendor( employee.getVendor() );
        employeeDto.setProject( employee.getProject() );
        employeeDto.setWorkLocation( employee.getWorkLocation() );
        employeeDto.setComments( employee.getComments() );
        employeeDto.setMsaRate( employee.getMsaRate() );
        employeeDto.setRate( employee.getRate() );
        employeeDto.setDiscountedFee( employee.getDiscountedFee() );

        return employeeDto;
    }

    @Override
    public List<EmployeeDto> mapList(List<Employee> empList) {
        if ( empList == null ) {
            return null;
        }

        List<EmployeeDto> list = new ArrayList<EmployeeDto>();
        for ( Employee employee : empList ) {
            list.add( map( employee ) );
        }

        return list;
    }
}
