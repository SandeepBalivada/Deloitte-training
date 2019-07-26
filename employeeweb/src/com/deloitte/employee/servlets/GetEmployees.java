package com.deloitte.employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.employee.beans.Employee;
import com.deloitte.employee.employeesDao.EmployeeDao;
import com.deloitte.employee.employeesDao.impl.EmployeesDaoImpl;

@WebServlet("/GetEmployees")
public class GetEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		EmployeeDao dao = new EmployeesDaoImpl();
		out.println("<table border=2>");
		out.println("<tr><th>EMPLCODE <th>EMPL NAME<th>JOB<th>SALARY<th>DATE JOINED</tr>");
		List<Employee> emplist = dao.getEmployees();
		for(Employee emp : emplist){
			out.println("<tr>");
		    out.println("<td>"+emp.getEmpcode());
		    out.println("<td>"+emp.getEmpname());
		    out.println("<td>"+emp.getJob());
		    out.println("<td>"+emp.getSalary());
		    out.println("<td>"+emp.getDatejoin());
		    out.println("</tr>");
		    
		    }
		out.println("</table>");
	}

}
