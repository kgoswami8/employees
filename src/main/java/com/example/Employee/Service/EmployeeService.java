package com.example.Employee.Service;

import com.example.Employee.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public List<Employee> fetchEmployee();
    public Optional<Employee> getEmployeeById(long id);
}
