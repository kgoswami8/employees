package com.example.Employee.Controller;

import com.example.Employee.Model.Employee;
import com.example.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/fetchAll")
    public List<Employee> fetchEmployee(){
        return employeeService.fetchEmployee();
    }

    @GetMapping("/getById/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable long id){
        return employeeService.getEmployeeById(id);
    }
}
