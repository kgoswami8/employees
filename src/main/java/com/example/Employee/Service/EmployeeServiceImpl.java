package com.example.Employee.Service;


import com.example.Employee.Exception.EmployeeRequestException;
import com.example.Employee.Model.Employee;
import com.example.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchEmployee() {
        List<Employee> orders= employeeRepository.findAll();
        return orders;
    }

    @Override
    
    public Optional<Employee> getEmployeeById(long id){
    	Optional<Employee> employee = employeeRepository.findById(id);
    	if(employee.isEmpty()) {
    		throw new EmployeeRequestException("ID not found ");
    	}
    	return employee;
    }
   
}
