package com.deloitte.employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.employeesDao.EmployeeDao;
import com.deloitte.employee.employeesDao.impl.EmployeesDaoImpl;


@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int code = Integer.parseInt(request.getParameter("empcode"));
		EmployeeDao dao = new EmployeesDaoImpl();
		int rows = dao.deleteEmployee(code);
		System.out.println(rows);
		if(rows>0)
			out.println(" deleted");
		else
			out.println(" not deleted");
	}

}
