package com.viraj.springboot.curddemo1.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.viraj.springboot.curddemo1.entity.*;
import com.viraj.springboot.curddemo1.dao.EmployeeDAO;
import java.util.*;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private EmployeeDAO employeeDAO;

	//quick and dirty : inject employee dao (use Constructor Injection)
	public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	//expose "/employees" and return a list of employees
	@RequestMapping("/employees")
	public List<Employee> findAll(){
		return employeeDAO.findAll();
		
	}
	
}
