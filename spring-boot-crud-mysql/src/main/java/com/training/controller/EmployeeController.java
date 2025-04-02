package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.training.model.Employee;
import com.training.service.EmployeeService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<List<Employee>> saveEmployees(@RequestBody List<Employee> employees) {
        if (employees != null && !employees.isEmpty()) {
            List<Employee> savedEmployees = employeeService.saveEmployees(employees);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployees);
        }
        Employee savedEmployee = employeeService.saveEmployee(new Employee());
        return ResponseEntity.status(HttpStatus.CREATED).body(List.of(savedEmployee));
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.fetchAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("id") Long id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee == null) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("message", "Employee " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
        return ResponseEntity.ok(employee);
    }

    // @PutMapping("/employee/{id}")
    // public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody
    // Employee employee) {
    // return employeeService.updateEmployeeById(id, employee);
    // }
    @PutMapping("/employee/{id}")
    public ResponseEntity<?> updateEmployeeById(@PathVariable("id") Long id, @RequestBody Employee employee) {
        Employee updatedEmployee = employeeService.updateEmployeeById(id, employee);

        if (updatedEmployee == null) {
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("message", "Employee " + id + " not found.");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }

        return ResponseEntity.ok(updatedEmployee);
    }

    // public String deleteEmployee(@PathVariable("id") Long id) {
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Map<String, String>> deleteEmployee(@PathVariable("id") Long id) {
        return employeeService.deleteDepartmentById(id);
    }

}
