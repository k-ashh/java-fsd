package com.portal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Submission
 */
public class Submission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Submission() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
/**		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String manufacturer=request.getParameter("manufacturer");
		String model=request.getParameter("model");
	
		Product p = new Product();
		p.setId(id);
		p.setName(name);
		p.setPrice(price);
		p.setManufacturer(manufacturer);
		p.setModel(model);
		
		RequestDispatcher rd =request.getRequestDispatcher("display.jsp");
		request.setAttribute("Product", p);
		rd.forward(request, response);
**/	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		String manufacturer=request.getParameter("manufacturer");
		String model=request.getParameter("model");
	
		Product p = new Product();
		p.setId(id);
		p.setName(name);
		p.setPrice(price);
		p.setManufacturer(manufacturer);
		p.setModel(model);
		
		RequestDispatcher rd =request.getRequestDispatcher("display.jsp");
		request.setAttribute("Product", p);
		rd.forward(request, response);
		
		
	}

}
