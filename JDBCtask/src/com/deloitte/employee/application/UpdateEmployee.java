package com.deloitte.employee.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.employeesDao.EmployeeDao;
import com.deloitte.employee.employeesDao.impl.EmployeesDaoImpl;

public class UpdateEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		EmployeeDao dao = new EmployeesDaoImpl();
		emp.setEmpcode(107);
		emp.setEmpname("Souji");
        emp.setJob("Manager");
        emp.setSalary(60500.00);
        String datejoin = "24-07-2019";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date dt = null;
        try {
			dt = sdf.parse(datejoin);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        emp.setDatejoin(dt);
        int rows = dao.updateEmployee(emp);
        System.out.println(rows);
        
        if(rows>0)
        	System.out.println(rows+" rows updated successfully");
        else
        	System.out.println("No rows updated");

	}

}
