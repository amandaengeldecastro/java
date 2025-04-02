package com.training.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.training.model.Employee;

/* A service layer is a layer in an application that facilitates communication between the controller and 
the persistence/entity layer. 
Additionally, business logic is stored in the service layer. */

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> saveEmployees(List<Employee> employees);
    List<Employee> fetchAllEmployees();
    Employee getEmployeeById(Long id);
    Employee updateEmployeeById(Long id, Employee employee);
    ResponseEntity<Map<String, String>> deleteDepartmentById(Long id);
}
