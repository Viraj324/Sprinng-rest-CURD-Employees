package com.viraj.springboot.curddemo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viraj.springboot.curddemo1.dao.EmployeeDAO;
import com.viraj.springboot.curddemo1.entity.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(theId);
	}

	@Transactional
	@Override
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		return employeeDAO.save(theEmployee);
	}

	@Transactional
	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		employeeDAO.deleteById(theId);
	}

}
