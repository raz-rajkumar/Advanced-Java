package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/forgot")
public class ForgotServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String pass=new ForgotDAO().forgot(req.getParameter("uname"), Long.parseLong(req.getParameter("phno")));
		if(pass!=null)
		{
			req.setAttribute("msg", "Your password is: "+pass);
			req.getRequestDispatcher("Forgot.jsp").forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "Invalid Process");
			req.getRequestDispatcher("Forgot.jsp").forward(req, res);
		}
		
	}
}
