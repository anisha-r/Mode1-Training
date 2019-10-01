package com.hcl.inventory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class CreateStockServlet
 */
@WebServlet("/CreateStockServlet")
public class CreateStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateStockServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher disp=request.getRequestDispatcher("MenuServlet");
		disp.include(request, response);
		Stock objStock=new Stock();
		String stockId=new StockDAO().generateStockDao();
		objStock.setStockId(stockId);
		objStock.setItemName(request.getParameter("itemName"));
		int price = Integer.parseInt(request.getParameter("price"));
		objStock.setPrice(price);
		
		int quantityAvail = Integer.parseInt(request.getParameter("QuantityAvail"));
		objStock.setQuantityAvail(quantityAvail);
	
		String result=StockBAL.createStockBal(objStock);
		
	
		out.println(result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
