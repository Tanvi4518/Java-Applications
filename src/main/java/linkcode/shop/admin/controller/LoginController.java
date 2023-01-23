package linkcode.shop.admin.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import linkcode.shop.admin.dao.ProductService;
import linkcode.shop.admin.daoImpl.ProductServiceImpl;
import linkcode.shop.admin.model.Login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adname=request.getParameter("AdNm");
		String pass=request.getParameter("pass");
		Login L=new Login(adname, pass);
		ProductService ps=new ProductServiceImpl();
		List<Login> lst=new ArrayList<Login>();
		lst.add(L);
		String msg=ps.validateAdmin(lst);
		HttpSession session=request.getSession();
		if(msg.equals("valid"))
		{
			response.sendRedirect("Dashboard.html");
		}
		else
		{
			session.setAttribute("msg",msg);
			response.sendRedirect("AdminLogin.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
