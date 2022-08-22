

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		PrintWriter pw=response.getWriter();

		if(username.equalsIgnoreCase("admin") && pwd.equals("admin")) {
			HttpSession session=request.getSession();
			session.setAttribute("userid",username);
			RequestDispatcher rd=request.getRequestDispatcher("dashboard.html");
			rd.include(request, response);
			pw.print("login successfull");

		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			pw.print("login failed !");
		}

	}

}
