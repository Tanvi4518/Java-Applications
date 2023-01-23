package linkcode.shop.user.dao;

import java.util.List;

import linkcode.shop.admin.model.Login;
import linkcode.shop.user.model.UserLogin;
import linkcode.shop.user.model.UserRegister;


public interface UserService {
	
	 public String registerUser(List<UserRegister> rlst);
	 public String validateUser(List<UserLogin> ulst);

}
