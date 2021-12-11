package com.sree.dao;

import java.util.List;
import com.sree.beans.Employee;

public interface IGetEmployeeDAO {
	
	public List<Employee> fetchEmployeefromDB(String desg1,String desg2,String desg3) throws Exception;

}
