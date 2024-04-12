package com.viraj.springboot.curddemo1.Service;

import java.util.List;

import com.viraj.springboot.curddemo1.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int theId);

	Employee save(Employee theEmployee);

	void deleteById(int theId);

}
