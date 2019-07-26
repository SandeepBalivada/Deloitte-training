package com.deloitte.employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.employeesDao.EmployeeDao;
import com.deloitte.employee.employeesDao.impl.EmployeesDaoImpl;


@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int code = Integer.parseInt(request.getParameter("empcode"));
		String name = request.getParameter("empname");
		String job = request.getParameter("job");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String datejoin = request.getParameter("datejoin");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date joindate = null;
		try {
			joindate = sdf.parse(datejoin);
		} catch (ParseException e) {
					}
		Employee emp = new Employee(code,name,job,salary,joindate);
		EmployeeDao dao = new EmployeesDaoImpl();
		int rows = dao.addEmployee(emp);
		System.out.println(rows);
		if(rows>0)
			out.println(" inserted");
		else
			out.println(" not inserted");
		
	}

}
