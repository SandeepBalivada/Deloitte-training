package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmpRequest")
public class EmpRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String code = request.getParameter("code");
		String name = request.getParameter("user");
	    double salary = Double.parseDouble(request.getParameter("salary"));
		String job = request.getParameter("job");
		String skills[] = request.getParameterValues("skills");
		out.println("<h2>Hello " + name+"("+code+")"+"!! Your Salary is "+salary+ "for your job as: "+job+"</h2><br><h3> Your skills are:</h3>");
		for(String s : skills)
			out.println(s);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
