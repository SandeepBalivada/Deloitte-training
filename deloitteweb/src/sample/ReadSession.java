package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ReadSession")
public class ReadSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession ssn = request.getSession();
		out.println(ssn.getAttribute("name")+"<br");
		out.println(ssn.getAttribute("id")+"<br>");
		out.println(ssn.getAttribute("mail")+"<br>");
	}

}
