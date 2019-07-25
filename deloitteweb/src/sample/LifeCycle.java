package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	int count = 0;
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("**Init method executed**");
	}

	
	public void destroy() {
		System.out.println("**destroy method executed**");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*out.println("Hello Sandeep. This is your servlet<br>");
		out.println("<h1><b>Heading done</b></h1>");
		out.println(count++);*/
		out.println("<!DOCTYPE html> <html> <body> <h1>Hello java script</h1> <button type='button' onclick='writeData()'>try it</button> <script> function writeData(){document.write(new Date()); } </script> </body> </html>");
	}
}
