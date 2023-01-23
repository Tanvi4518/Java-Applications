package linkcode.shop.user.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import linkcode.shop.user.dao.UserService;
import linkcode.shop.user.daoImpl.UserServiceImpl;
import linkcode.shop.user.model.UserRegister;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class UserRegistercontroller
 */
public class UserRegistercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String cpassword=request.getParameter("cpassword");
		String country=request.getParameter("country");
		String address=request.getParameter("address");
		String pincode=request.getParameter("pincode");
		
		UserRegister ureg=new UserRegister(fname, lname, email, password, cpassword, country, address, pincode);
		List<UserRegister> rlst=new ArrayList<UserRegister>();
		rlst.add(ureg);
		UserService us=new UserServiceImpl();
		String msg=us.registerUser(rlst);
		HttpSession session=request.getSession();
		if(msg.equals("valid"))
		{
			msg="RegisteredSuccessfully!";
		}
		else
		{
			msg="TRYAgain!";
		}
		session.setAttribute("msg", msg);
		response.sendRedirect("UserRegister.jsp");
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
