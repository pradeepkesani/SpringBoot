package com.springbootwebapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.springbootwebapp.entity.Employee;



@Repository

public interface EmployeeRepository extends  JpaRepository<Employee, Integer>{

	List<Employee> findAll();

	



}
