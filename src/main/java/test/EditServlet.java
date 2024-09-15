package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditServlet extends HttpServlet{
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
			RequestDispatcher rd=req.getRequestDispatcher("Edit.jsp");
			rd.forward(req, res);
		}
	}
}
