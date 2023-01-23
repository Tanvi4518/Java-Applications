package linkcode.shop.admin.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import linkcode.shop.admin.dao.ProductService;
import linkcode.shop.admin.daoImpl.ProductServiceImpl;
import linkcode.shop.admin.model.Product;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Servlet implementation class DisplayAllController
 */
public class DisplayAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> plst=new LinkedList<Product>();
		ProductService ps=new ProductServiceImpl();
		plst=ps.getAllProduct();
		HttpSession session=request.getSession();
		if(plst!=null)
		{
			session.setAttribute("prodlst", plst);
		}
		response.sendRedirect("DisplayAllView.jsp");  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
