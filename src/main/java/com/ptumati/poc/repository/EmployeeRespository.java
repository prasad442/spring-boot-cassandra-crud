package com.ptumati.poc.repository;
import org.springframework.data.repository.CrudRepository;

import com.ptumati.poc.model.Employee;

public interface EmployeeRespository extends  CrudRepository<Employee, String>{

}
