package com.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    
    /*
    Wrapper is used when we're working with collections, such as ArrayList,
    where primitive types cannot be used (list store only objects)

    ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
    ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid and Not Null
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "employee_name", nullable = false)
    private String employeeName;

    @Column(name = "employee_salary", nullable = false)
    private String employeeSalary;

    @Column(name = "employee_email", nullable = false)
    private String employeeEmail;

}
