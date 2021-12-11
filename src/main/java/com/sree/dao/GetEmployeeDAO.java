package com.sree.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sree.beans.Employee;

@Repository("empDAO")
public class GetEmployeeDAO implements IGetEmployeeDAO {
	
	@Autowired
	private DataSource ds;
	
	
	@Override
	public List<Employee> fetchEmployeefromDB(String desg1, String desg2, String desg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Used Data Source is:"+ds.getClass());
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT EMPNO,EMPNAME,SALARY FROM EMPLOYEE WHERE JOB IN(?,?,?)");
		
		ps.setString(1, desg1);
		ps.setString(2, desg2);
		ps.setString(3, desg3);
		
		ResultSet rs=ps.executeQuery();
		
		List<Employee> lEmps=new ArrayList<>();
		while(rs.next())
		{
			Employee e= new Employee();
			e.setEmpno(rs.getInt(1));
			e.setEmpname(rs.getString(2));
			e.setEmpsal(rs.getString(3));
			//e.setEmpsal(rs.getFloat(4));
			lEmps.add(e);
		}
		
		return lEmps;
	}

}
