package com.mjgomes.demolazy.repositories;

import com.mjgomes.demolazy.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
