package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		LoginDAO ldao=new LoginDAO();
		UserBean ub=ldao.login(req.getParameter("uname"), req.getParameter("pass"));
		if(ub!=null)
		{
			ServletContext sct=req.getServletContext();
			sct.setAttribute("ubean", ub);
			Cookie ck=new Cookie("faname", ub.getfName());			
			res.addCookie(ck);			
			RequestDispatcher rd=req.getRequestDispatcher("LoginSuccess.jsp");
			rd.forward(req, res);
		}
		else
		{
			req.setAttribute("msg", "Invalid Username/Password");
			RequestDispatcher rd=req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
	}
}
