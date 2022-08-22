

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Retrieve
 */
public class Retrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Retrieve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAO dao=new DAO();
		String id=request.getParameter("id");
		try {
			ResultSet rs= dao.retrieve(id);
			PrintWriter pw=response.getWriter();
			
			while(rs.next()) {
				pw.println("The Details of the Product:");
				pw.println("Product ID:"+rs.getInt(1)+" \t Product Name:"+rs.getString(2)+" \t Price:"+rs.getString(3));
			}
		} 
		catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) {
		// TODO Auto-generated catch block
			PrintWriter pw=response.getWriter();
			pw.println("The Entered Product ID Does Not Exists in the Table!!!");
			e.printStackTrace();	
		}
	}
}
