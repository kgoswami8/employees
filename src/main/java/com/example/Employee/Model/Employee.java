package com.example.Employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	//@GeneratedValue
    private long employeeId;
    private String employeeName;
    private String employeeBU;
    private String location;
    
}
