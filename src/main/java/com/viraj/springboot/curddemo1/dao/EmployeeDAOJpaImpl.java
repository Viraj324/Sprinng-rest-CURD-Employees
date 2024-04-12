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

}
