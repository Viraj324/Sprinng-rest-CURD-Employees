package com.viraj.springboot.curddemo1.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.viraj.springboot.curddemo1.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


@Repository

public class EmployeeDAOJpaImpl implements EmployeeDAO{

	//define feild for entityManager
	private EntityManager entityManager;
	
	public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		//create a query 
		TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee",Employee.class);
		
		//execute  query get result list
		List<Employee> employee = theQuery.getResultList();
		
		
		//return the results
		
		return employee;
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		//get employee
		Employee theEmployee = entityManager.find(Employee.class, theId);
		
		//return employee
		return theEmployee;
	}

	@Override
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		
		//save employeee
		Employee dbEmployee = entityManager.merge(theEmployee);
		return dbEmployee;
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		//find employee By iD
		Employee theEmployee = entityManager.find(Employee.class, theId);
		
		//Remove employee
		entityManager.remove(theEmployee);
		
	}

}
