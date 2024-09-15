package test;
import java.sql.*;
public class LoginDAO {
	public UserBean ub=null;
	public UserBean login(String uname,String pass)
	{
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from userapp63 where uname=? and pword=?");
			ps.setString(1, uname);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				ub=new UserBean();
				ub.setuName(uname);
				ub.setPass(pass);
				ub.setfName(rs.getString(3));
				ub.setlName(rs.getString(4));
				ub.setCity(rs.getString(5));
				ub.setMailId(rs.getString(6));
				ub.setPhNo(rs.getLong(7));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ub;
	}
}
