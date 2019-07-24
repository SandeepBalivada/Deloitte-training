package com.deloitte.employee.application;

//import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.employeesDao.EmployeeDao;
import com.deloitte.employee.employeesDao.impl.EmployeesDaoImpl;

public class DeleteEmployee {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		EmployeeDao dao = new EmployeesDaoImpl();
		int id = 107;
		int rows = dao.deleteEmployee(id);
		if(rows>0)
        	System.out.println(rows+" rows deleted successfully");
        else
        	System.out.println("No rows deleted");
		

	}

}
