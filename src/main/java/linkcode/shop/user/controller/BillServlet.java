package linkcode.shop.user.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import linkcode.shop.admin.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class BillServlet
 */
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double total=0;
		double cgst,sgst,finaltotal;
		HttpSession session=request.getSession();
		List<Product> plst=(List<Product>)session.getAttribute("prodlst");
		
		for(Product pobj:plst)
		{
			total=total+(pobj.getProdPrice()*pobj.getProdQty());
		}
		cgst=total*0.06;
		sgst=total*0.06;
		finaltotal=total+cgst+sgst;
		Bill bobj=new Bill(111, total, total, sgst, finaltotal);
		session.setAttribute("bill", bobj);
		response.sendRedirect("ProductBill.jsp");
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
