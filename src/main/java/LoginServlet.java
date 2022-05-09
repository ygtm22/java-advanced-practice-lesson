

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
	    // doGet(request, response);
	      String id = request.getParameter("id");
	      String password = request.getParameter("password");

	      System.out.println(id);
	      System.out.println(password);

	      if (password.equals("axizuser") && id.equals("axiz") || password.equals("technocore") && id.equals("techno-pass")) {
	    	  request.setAttribute("id", id);
	    	  request.setAttribute("passwordMatch", password);
	    	  request.getRequestDispatcher("/result.jsp").forward(request, response);
			} /*
				 * else { //request.setAttribute("passwordMatch", "ng");
				 * request.getRequestDispatcher("/login.jsp").forward(request, response); }
				 */
	      
    	  //request.setAttribute("Utility.isNullOrEmpty()", false);
	      
	      if (Utility.isNullOrEmpty(id)) {
	    	  request.setAttribute("id_isEmpty", true);
	    	  request.getRequestDispatcher("/login.jsp").forward(request, response);
	      }
	      
	      if (Utility.isNullOrEmpty(password)) {
	    	  request.setAttribute("pass_isEmpty", true);
	    	  request.getRequestDispatcher("/login.jsp").forward(request, response);
	      }
	      
			/*
			 * if (!password.equals("axizuser") && id.equals("axiz") ||
			 * password.equals("technocore") && id.equals("techno-pass")) {
			 * request.getRequestDispatcher("/login.jsp").forward(request, response); }
			 */
			/*
			 * if (Utility.isNullOrEmpty(id) && Utility.isNullOrEmpty(password)) {
			 * request.setAttribute("id_isEmpty", true);
			 * request.setAttribute("pass_isEmpty", true);
			 * request.getRequestDispatcher("/login.jsp").forward(request, response); }
			 */

	      //request.getRequestDispatcher("/result.jsp").forward(request, response);
	  }
}
