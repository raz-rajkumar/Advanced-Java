package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/upd")
public class UpadateServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie c[]=req.getCookies();
		
		if(c!=null)
		{
			ServletContext sct=req.getServletContext();
			UserBean ub=(UserBean)sct.getAttribute("ubean");
			String fn=c[0].getValue();
			ub.setCity(req.getParameter("city"));
			ub.setMailId(req.getParameter("mailid"));
			ub.setPhNo(Long.parseLong(req.getParameter("phno")));
			int k=new UpdateDAO().update(ub);
			if(k>0)
			{
				req.setAttribute("fname",fn );
				req.setAttribute("msg", "Profile Updated Successfully...<br>");
				req.getRequestDispatcher("UpdateProfile.jsp").forward(req, res);
			}
			
		}
		else
		{
			req.setAttribute("msg", "Session Expired...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("Msg.jsp");
			rd.forward(req, res);
		}
	}
}
