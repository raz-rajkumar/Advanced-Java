package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie c[]=req.getCookies();
		if(c!=null)
		{
			ServletContext sct=req.getServletContext();
			sct.removeAttribute("ubean");
			c[0].setMaxAge(0);
			res.addCookie(c[0]);
			req.setAttribute("msg", "User Logged Out Successfully...<br>");
			
		}
		else			
		{
			req.setAttribute("msg", "Session Expired!!<br>");
			
		}
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}
}
