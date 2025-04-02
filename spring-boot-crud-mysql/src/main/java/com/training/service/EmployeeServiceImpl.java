package com.training.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import com.training.model.Employee;
import com.training.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchAllEmployees() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return allEmployees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        }
        return null;
    }


    @Override
    public Employee updateEmployeeById(Long id, Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);

        if (!employeeOptional.isPresent()) return null;

        Employee originalEmployee = employeeOptional.get();

        if (Objects.nonNull(employee.getEmployeeName()) && !employee.getEmployeeName().trim().isEmpty()) {
            originalEmployee.setEmployeeName(employee.getEmployeeName());
        }
        if (Objects.nonNull(employee.getEmployeeSalary())) {
            originalEmployee.setEmployeeSalary(employee.getEmployeeSalary());
        }
        if (Objects.nonNull(employee.getEmployeeEmail())) {
            originalEmployee.setEmployeeEmail(employee.getEmployeeEmail());
        }
        return employeeRepository.save(originalEmployee);
    }



    /*@Override
    public String deleteDepartmentById(Long id) {
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.deleteById(id);
             Map<String, String> response = new HashMap<>();
             response.put("message", "Employee deleted successfully");

            return response.toString();
        }
        return "No such employee in the database";
    }*/

    @Override
    public ResponseEntity<Map<String, String>> deleteDepartmentById(Long id) {
        Map<String, String> response = new HashMap<>();
    
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.deleteById(id);
            response.put("message", "Employee " + id + " deleted successfully."); 
            return ResponseEntity.ok(response); 
        }
    
        response.put("message", "Employee " + id + " not found.");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response); 
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees); 
    }

   
    
}