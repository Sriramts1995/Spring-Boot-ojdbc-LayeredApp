package com.sree;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sree.beans.Employee;
import com.sree.controller.EmployeeController;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringBoot02LayeredApp1Application {

	public static void main(String[] args) {
		ApplicationContext ctxApplicationContext=SpringApplication.run(SpringBoot02LayeredApp1Application.class, args);
		
		EmployeeController employeeController=ctxApplicationContext.getBean("controller",EmployeeController.class);
		try {
			List<Employee> empmainlist=employeeController.fetchEmployeefromService("Developer", "Manager", "Clerk");	
			empmainlist.forEach(emp->{
				System.out.println("Data is:");
				System.out.println(emp.toString());
				//System.out.println(emp.getEmpjob());
				System.out.println(emp.getEmpname());
				//System.out.println(emp.getEmpjob());
				System.out.println(emp.getEmpno());
				System.out.println(emp.getEmpsal());
				
				});
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		((ConfigurableApplicationContext)ctxApplicationContext).close();
		
	}

}
