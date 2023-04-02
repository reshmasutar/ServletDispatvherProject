package requestdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginlink")
public class Validation extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("user");
		String password = req.getParameter("pass");
		
		
		if(id.equalsIgnoreCase("Reshma") && password.equalsIgnoreCase("Reshma@123")){
			RequestDispatcher rd = req.getRequestDispatcher("welcomelink");
			rd.forward(req, resp);
		}else{
			PrintWriter pw = resp.getWriter();
			pw.print("<h1 style='color:red'>INVALID DETAILD</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
		
		
	}
	
	

}
