package test;
import java.sql.*;
public class ForgotDAO {
	String pass=null;
	public String forgot(String uname,long phno)
	{
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select pword from userapp63 where uname=? and phno=?");
			ps.setString(1, uname);
			ps.setLong(2, phno);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				pass=rs.getString(1);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pass;
	}
}
