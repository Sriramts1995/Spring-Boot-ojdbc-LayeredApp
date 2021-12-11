package com.sree.service;
import com.sree.beans.Employee;
import java.util.List;
public interface IGetEmployeeService {

	public List<Employee> fetchEmployeeService(String desg1,String desg2,String desg3) throws Exception;
}
