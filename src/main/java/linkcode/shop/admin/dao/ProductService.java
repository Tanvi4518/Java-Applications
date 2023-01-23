package linkcode.shop.admin.dao;

import java.util.List;


import linkcode.shop.admin.model.Login;
import linkcode.shop.admin.model.Product;
import linkcode.shop.admin.model.Register;


public interface ProductService {
	
	 public String createProduct(List<Product> lst);
	 public List<Product> retriveProduct(int prodId);
	 public List<Product> getAllProduct();
	 public boolean deleteProduct(int prodId);
	 public String validateAdmin(List<Login> lst);
	 public int createRecord(List<Register> lst);
	
	 
}
