
package com.deloitte.employee.application;

import java.util.List;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.employeesDao.EmployeeDao;
import com.deloitte.employee.employeesDao.impl.EmployeesDaoImpl;

public class GetEmployees {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeesDaoImpl();
		List<Employee> empls = dao.getEmployees();
		for(Employee emp : empls )
			System.out.println(emp.getEmpcode()+"\t"+emp.getEmpname()+" "+emp.getJob()+" "+emp.getSalary()+" "+emp.getDatejoin());

	}

}
