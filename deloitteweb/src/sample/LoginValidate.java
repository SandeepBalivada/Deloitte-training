package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginValidate")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String user = request.getParameter("username");
		String password = request.getParameter("pwd");
		RequestDispatcher rd;
		if(user=="" || password==""){
			out.println("<h4>You have to enter both username and password</h4>");
			//rd= request.getRequestDispatcher("Login.html");
			//rd.forward(request, response);
			}
		else{
			if(user.equalsIgnoreCase("admin")){
				  rd = request.getRequestDispatcher("Admin");
					//response.sendRedirect("Admin"); 
					
					}
				else
					rd = request.getRequestDispatcher("User");
					//response.sendRedirect("User");
			rd.forward(request, response);

			}
		
		//rd.include(request, response);
		out.println("<h2>Success</h2>");

		}
		
}
