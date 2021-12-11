package com.sree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sree.beans.Employee;
import com.sree.dao.IGetEmployeeDAO;

@Service("empService")
public class GetEmployeeService implements IGetEmployeeService {

	@Autowired
	private IGetEmployeeDAO dao;
	
	@Override
	public List<Employee> fetchEmployeeService(String desg1, String desg2, String desg3) throws Exception {
		// TODO Auto-generated method stub
		List<Employee> lempsservice=dao.fetchEmployeefromDB(desg1, desg2, desg3);
		return lempsservice;
	}

}
