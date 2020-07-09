package com.marcus.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcus.crud.models.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
