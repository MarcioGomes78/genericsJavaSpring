package com.mjgomes.demolazy.services;

import com.mjgomes.demolazy.dto.EmployeeDTO;
import com.mjgomes.demolazy.entities.Employee;
import com.mjgomes.demolazy.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements GenericService<Employee, EmployeeDTO, Long> {


	@Autowired
	private EmployeeRepository repository;

	@Override
	public JpaRepository<Employee, Long> getRepository() {
		return repository;
 	}
}
