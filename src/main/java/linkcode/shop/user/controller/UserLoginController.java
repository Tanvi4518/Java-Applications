package linkcode.shop.user.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import linkcode.shop.user.dao.UserService;
import linkcode.shop.user.daoImpl.UserServiceImpl;
import linkcode.shop.user.model.UserLogin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class UserLoginController
 */
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		UserLogin ulog=new UserLogin(email, password);
		List<UserLogin> ulst=new ArrayList<UserLogin>();
		ulst.add(ulog);
		UserService us=new UserServiceImpl();
	    String msg=us.validateUser(ulst);
	    HttpSession session=request.getSession();
	    if(msg.equals("valid")) {
	    	msg="LoginSuccessfully";	
	    }
	    else
	    {
	    	msg="Login Failed!Try Again!";
	    }
	    session.setAttribute("msg",msg);
	    response.sendRedirect("UserLogin.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
