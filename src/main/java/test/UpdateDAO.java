package test;

import java.sql.*;

public class UpdateDAO {
	int k = 0;

	public int update(UserBean ub) {
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con
					.prepareStatement("update userapp63 set city=?,mailid=?,phno=? where uname=? and pword=?");
			ps.setString(1, ub.getCity());
			ps.setString(2, ub.getMailId());
			ps.setLong(3, ub.getPhNo());
			ps.setString(4, ub.getuName());
			ps.setString(5, ub.getPass());
			k = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
