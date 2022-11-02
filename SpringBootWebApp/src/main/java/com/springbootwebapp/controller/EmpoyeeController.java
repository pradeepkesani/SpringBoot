package com.springbootwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootwebapp.entity.Employee;
import com.springbootwebapp.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmpoyeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	@PostMapping
	public Employee saveEmp(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	@GetMapping("/fetch-all")
	public List<Employee> getAllEmps() {
		return employeeRepository.findAll();
	}
	@GetMapping
	public Employee getAllEmps(@RequestParam Integer empId) {
		return employeeRepository.findById(empId).get();
	}
	@PutMapping
	public Employee updateEmp(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

		
	@DeleteMapping
	public String deleteEmp(@RequestParam Integer empId) {
		 employeeRepository.deleteById(empId);
		 return "Deleted Succesfully";
		 
	
		
	


}
}
