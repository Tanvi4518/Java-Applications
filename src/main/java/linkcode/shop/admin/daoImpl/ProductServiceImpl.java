package linkcode.shop.admin.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import linkcode.shop.admin.dao.ProductService;
import linkcode.shop.admin.model.Login;
import linkcode.shop.admin.model.Product;
import linkcode.shop.admin.model.Register;
import linkcode.shop.db.ShopDb;

public class ProductServiceImpl implements ProductService {
	
	ShopDb sh=new ShopDb();
	int i=0,j=0,k=0;
	String str=null;
	public String createProduct(List<Product> lst)
	{
		Connection con=ShopDb.getConnection();
		Product pobj=lst.get(0);
		try {
			PreparedStatement pstate=con.prepareStatement("insert into Product values(?,?,?,?)");
			pstate.setInt(1,pobj.getProdId());
			pstate.setString(2,pobj.getProdNm());
			pstate.setDouble(3,pobj.getProdPrice());
			pstate.setInt(4,pobj.getProdQty());
			
			int i=pstate.executeUpdate();
			if(i>0)
			{
				str="valid";
			}
		} catch (SQLException e) {
			System.out.println("test1..");
			System.out.println(e.getMessage());
			str=e.getMessage();
			e.printStackTrace();
		}
		return str;
	}
	@Override
	public List<Product> retriveProduct(int prodId) {
		Connection con=ShopDb.getConnection();
		List<Product> plst=null;
		
		try {
			PreparedStatement pstate=con.prepareStatement("select *from Product where prod_Id=?");
			pstate.setInt(1, prodId);
			ResultSet rs=pstate.executeQuery();
			if(rs.next())
			{
				plst=new ArrayList<Product>();
				Product P=new Product(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4));
				plst.add(P);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return plst;
	}
	@Override
	public List<Product> getAllProduct() {
		Connection con=ShopDb.getConnection();
		String str="select *from Product";
		List<Product> lst=new LinkedList<Product>();
		try {
			Statement state = con.createStatement();
			ResultSet rs=state.executeQuery(str);
			while(rs.next())
			{
				Product pobj=new Product(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4));
				lst.add(pobj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}
	@Override
	public boolean deleteProduct(int prodId) {
		Connection con=ShopDb.getConnection();
		boolean b=false;
		try {
			PreparedStatement pstate=con.prepareStatement("delete from Product where prod_Id=?");
			pstate.setInt(1, prodId);
			 i=pstate.executeUpdate();
			 if(i>0)
			 {
				 b=true;
			 }
			 else
			 {
				 b=false;
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	@Override
	public String validateAdmin(List<Login> lst) {
		Connection con=ShopDb.getConnection();
		Login lobj=lst.get(0);
		String msg=null;
		String str="select user_name,password from Admin";
		try {
			Statement state=con.createStatement();
			ResultSet rs=state.executeQuery(str);
			while(rs.next())
			{
				if(rs.getString(1).equals(lobj.getAdname()))
				{
					if(rs.getString(2).equals(lobj.getPass()))
					{
						msg="valid";
						break;
					}
					else
					{
						msg="invalidPassword";
					}
				}
				else
				{
					msg="invalidAdminName";
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return msg;
	}
	@Override
	public int createRecord(List<Register> lst) {
		Connection con=ShopDb.getConnection();
		Register reg=lst.get(0);
		try {
			PreparedStatement pstate=con.prepareStatement("insert into Admin values(?,?)");
			pstate.setString(1,reg.getAdNm());
			pstate.setString(2,reg.getPass());
			 int j=pstate.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return j;
	}
	
}
