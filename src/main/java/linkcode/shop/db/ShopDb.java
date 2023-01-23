package linkcode.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ShopDb {
	
	public static  Connection getConnection() 
	{
		Connection con=null;
		try {
			String driver="oracle.jdbc.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user_name="System";
			String pass="123456789";
			Class.forName(driver);
			//step2-connection to database
		   con=DriverManager.getConnection(url, user_name, pass);
		   System.out.println("Connection to database...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 
	
	 
	return con;
	
	}

}
