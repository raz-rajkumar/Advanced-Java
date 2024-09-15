package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserBean ub=new UserBean();
		ub.setuName(req.getParameter("uname"));
		ub.setPass(req.getParameter("pass"));
		ub.setfName(req.getParameter("fname"));
		ub.setlName(req.getParameter("lname"));
		ub.setCity(req.getParameter("city"));
		ub.setMailId(req.getParameter("mail"));
		ub.setPhNo(Long.parseLong(req.getParameter("phno")));
		RegisterDAO rdao=new RegisterDAO();
		int k=rdao.insert(ub);
		if(k>0)
		{
			req.setAttribute("msg", "User Registered Successfully...");
			RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "User Registration Failed...");
			RequestDispatcher rd=req.getRequestDispatcher("register.html");
			rd.include(req, res);
		}
	}
}
