package com.sree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sree.beans.Employee;
import com.sree.service.IGetEmployeeService;

@Controller("controller")
public class EmployeeController {
	
	@Autowired
	private IGetEmployeeService service;
	
	public List<Employee> fetchEmployeefromService(String desg1,String desg2,String desg3) throws Exception{
		
		List<Employee> myemp=service.fetchEmployeeService(desg1, desg2, desg3);
		return myemp;
	}

}
