package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/profile")
public class ViewProfileServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie c[]=req.getCookies();
		if(c==null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
		else
		{
			String fn=c[0].getValue();
			req.setAttribute("fname", fn);
			RequestDispatcher rd=req.getRequestDispatcher("ViewProfile.jsp");
			rd.forward(req, res);
		}
	}
}
