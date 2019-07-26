package com.deloitte.employee.employeesDao;

import java.util.List;

import com.deloitte.employee.beans.Employee;

public interface EmployeeDao {
	void openConnection();
	void close();
	int addEmployee(Employee emp);
	int deleteEmployee(int empid);
	int updateEmployee(Employee emp);
	List<Employee> getEmployees();
	

}
