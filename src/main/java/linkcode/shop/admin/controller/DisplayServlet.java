package linkcode.shop.admin.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import linkcode.shop.admin.dao.ProductService;
import linkcode.shop.admin.daoImpl.ProductServiceImpl;
import linkcode.shop.admin.model.Product;
import linkcode.shop.db.ShopDb;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("dsplayserv1");
		ProductService ps=new ProductServiceImpl();
		List<Product> plst=ps.getAllProduct();
		System.out.println("dsplayserv2");
		
		request.setAttribute("plist",plst);
		RequestDispatcher view = request.getRequestDispatcher("AllRecord.jsp");
		view.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
