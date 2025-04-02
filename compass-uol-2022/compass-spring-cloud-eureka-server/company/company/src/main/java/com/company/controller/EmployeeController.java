package com.company.controller;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.company.controller.dto.EmployeeDto;
import com.company.controller.form.EmployeeForm;
import com.company.model.Employee;
import com.company.model.Company;
import com.company.repository.EmployeeRepository;
import com.company.repository.CompanyRepository;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired CompanyRepository lRepository;
	
	@Autowired
	private EmployeeRepository eRepository;
	
	@PostMapping
	@Transactional
	@CacheEvict(value = "employee", allEntries = true)
	public ResponseEntity<?> registerEmployee(@RequestBody @Valid EmployeeForm form, UriComponentsBuilder uriBuilder) {

			Employee employee = form.converter(form);
			eRepository.save(employee);

		URI uri = uriBuilder.path("/register/{id}").buildAndExpand(employee.getId()).toUri();
		return ResponseEntity.created(uri).body(new EmployeeDto(employee));
	}
	
	@GetMapping
	@Transactional
	@Cacheable(value = "employee")
	public Page<EmployeeDto> list(@PageableDefault(sort="id", direction= Direction.ASC,page=0, size=10)Pageable paginacao) {

		Page<Employee> employees = eRepository.findAll(paginacao);
		return EmployeeDto.converter(employees);

	}
	
	@PutMapping("/{id}")
	@Transactional
	@CacheEvict(value = "employee", allEntries = true)
	public ResponseEntity<EmployeeDto> udpate(@PathVariable Long id, @RequestBody @Valid EmployeeForm form) {	

		Optional<Employee> optional = eRepository.findById(id);

		if (optional.isPresent()) {
			Employee employee = optional.get();
			Employee employeeUpdate = form.update(employee);
			return ResponseEntity.ok(new EmployeeDto (employeeUpdate));
		}
		return ResponseEntity.notFound().build();
	}
	
}
