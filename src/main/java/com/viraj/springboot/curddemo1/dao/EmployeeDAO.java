package com.viraj.springboot.curddemo1.dao;
import java.util.*;
import com.viraj.springboot.curddemo1.entity.Employee;


public interface EmployeeDAO {
	List<Employee> findAll();
	Employee findById(int theId);
	
	Employee save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
