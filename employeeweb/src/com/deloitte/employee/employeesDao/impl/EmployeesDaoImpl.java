package com.deloitte.employee.employeesDao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.employeesDao.EmployeeDao;
import com.deloitte.employee.utils.EmployeeDEQueries;

import oracle.jdbc.OracleDriver;

public class EmployeesDaoImpl implements EmployeeDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	private ResultSetMetaData rsmd;

	@Override
	public void openConnection() {
		try {
			DriverManager.registerDriver(new OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String username = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
				e.printStackTrace();
		}
	
	    
	}

	@Override
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public int addEmployee(Employee emp) {
		openConnection();
		int rows= 0;
		
		try {
			pst = conn.prepareStatement(EmployeeDEQueries.INSERTQUERY);
			pst.setInt(1,emp.getEmpcode());
			pst.setString(2, emp.getEmpname());
			pst.setString(3, emp.getJob());
			pst.setDouble(4, emp.getSalary());
			Date sqldate = new Date (emp.getDatejoin().getTime());
			pst.setDate(5,sqldate);
	        rows = pst.executeUpdate();	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	    finally{
	    	close();
	    }
        
        return rows;
	}

	@Override
	public int deleteEmployee(int empcode) {
		openConnection();
		int rows=0;
		try {
			pst = conn.prepareStatement(EmployeeDEQueries.DELETEQUERY);
			pst.setInt(1, empcode);			
			rows= pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			close();
		}
		
		return rows;
	}

	@Override
	public int updateEmployee(Employee emp) {
		openConnection();
		int rows = 0;
		
		try {
			pst = conn.prepareStatement(EmployeeDEQueries.UPDATEQUERY);
			pst.setInt(5,emp.getEmpcode());
			pst.setString(1, emp.getEmpname());
			pst.setString(2, emp.getJob());
			pst.setDouble(3, emp.getSalary());
			Date sqldate = new Date (emp.getDatejoin().getTime());
			pst.setDate(4,sqldate);
	        rows = pst.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
	    	close();
	    }
		
		
		
		return rows;
	}

	@Override
	public List<Employee> getEmployees() {
		openConnection();
		List<Employee> emplist = new ArrayList<Employee>();
		try {
			pst =conn.prepareStatement(EmployeeDEQueries.GETEMPLSQUERY);
			rs = pst.executeQuery();
			rsmd = rs.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++)
				System.out.print(rsmd.getColumnName(i)+"\t");
			System.out.println("\n----------------------------------------------");
			
			while(rs.next())
			{
				Employee emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getDate(5));
				emplist.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return emplist;
	}
	

}
