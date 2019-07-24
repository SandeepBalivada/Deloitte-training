package com.deloitte.employee.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.employeesDao.EmployeeDao;
import com.deloitte.employee.employeesDao.impl.EmployeesDaoImpl;

public class AddEmployee {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeesDaoImpl();
		Employee emp = new Employee();
		emp.setEmpcode(104);
		emp.setEmpname("Darshi");
        emp.setJob("Assistant");
        emp.setSalary(50000.00);
        String datejoin = "22-07-2019";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dt = null;
        try {
			dt = sdf.parse(datejoin);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        emp.setDatejoin(dt);
        int rows = dao.addEmployee(emp);
        
        if(rows>0)
        	System.out.println(rows+" rows inserted successfully");
        else
        	System.out.println("No rows inserted");
        
	}

}
