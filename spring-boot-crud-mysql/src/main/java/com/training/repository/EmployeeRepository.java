package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.Employee;

/* JPA stands for Java Persistence API (Application Programming Interface).
   JPA is a specification which specifies how to access, manage and persist information/data 
   between java objects and relational databases. */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
