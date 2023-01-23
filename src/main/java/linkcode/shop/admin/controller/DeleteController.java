package linkcode.shop.admin.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import linkcode.shop.admin.dao.ProductService;
import linkcode.shop.admin.daoImpl.ProductServiceImpl;

import java.io.IOException;

/**
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodId=Integer.parseInt(request.getParameter("pid"));
		ProductService ps=new ProductServiceImpl();
		boolean bool=false;
		String msg=null;
		bool=ps.deleteProduct(prodId);
		HttpSession session=request.getSession();
		if(bool)
		{
			msg="Record deleted Successfully ";	
		}
		else
		{
			msg="Invalid Product ID";
			
		}
		session.setAttribute("msg",msg);
		response.sendRedirect("ProductDelete.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
