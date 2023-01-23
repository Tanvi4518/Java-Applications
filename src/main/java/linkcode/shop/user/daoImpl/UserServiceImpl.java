package linkcode.shop.user.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import linkcode.shop.admin.model.Login;
import linkcode.shop.db.ShopDb;
import linkcode.shop.user.dao.UserService;
import linkcode.shop.user.model.UserLogin;
import linkcode.shop.user.model.UserRegister;

public class UserServiceImpl implements UserService {
	
	String msg=null;
	public String registerUser(List<UserRegister> rlst) {
		Connection con=ShopDb.getConnection();
		UserRegister ureg=rlst.get(0);
		try {
			PreparedStatement pstate=con.prepareStatement("insert into UserLogin values(?,?,?,?,?,?,?,?)");
			pstate.setString(1,ureg.getFname());
			pstate.setString(2,ureg.getLname());
			pstate.setString(3,ureg.getEmail());
			pstate.setString(4,ureg.getPassword());
			pstate.setString(5,ureg.getCpassword());
			pstate.setString(6,ureg.getCountry());
			pstate.setString(7,ureg.getAddress());
			pstate.setString(8,ureg.getPincode());
			int k=pstate.executeUpdate();
			if(k>0)
			{
				msg="valid";
			}
			else
			{
				msg="Invalid";
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return msg;
	
	}
	@Override
	public String validateUser(List<UserLogin> ulst) {
		Connection con=ShopDb.getConnection();
		UserLogin uobj=ulst.get(0);
		String msg=null;
		String str="select email,password from UserLogin";
		try {
			Statement state=con.createStatement();
			ResultSet rs=state.executeQuery(str);
			while(rs.next())
			{
				if(rs.getString(1).equals(uobj.getEmail()));
				{
					if(rs.getString(2).equals(uobj.getPassword()))
					{
						msg="valid";
						break;
					}
					else
					{
						msg="invalidPassword";
					}
				}
					
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return msg;
	}
	

}
