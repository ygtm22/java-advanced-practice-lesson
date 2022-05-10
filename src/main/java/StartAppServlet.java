

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;
import app.GameApp;
/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StartAppServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * PrintWriter out = response.getWriter(); out.println("<!DOCTYPE html>");
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
		 request.setCharacterEncoding("UTF-8");
			
		    String name = request.getParameter("name");
		    String game = request.getParameter("application");
		    
		    GameApp gm = new GameApp("何か");
		    CardGameApp cgm = new CardGameApp("トランプ");
		    
		    //@SuppressWarnings("unused")
			String result = cgm.start(name);

		    /*if (name != null && !name.isEmpty()) {
		    	// このif分の中で、GameAppクラスのstartメソッドを呼び出し、
		    	// 戻り値をresultに代入してください。
*/		    
			if(game == "card") {
				result = cgm.start(name);
			}else if(game == "game") {
				result = gm.start(name);
			}
			
			
			/*
			 * }else{ result = "未実施"; }
			 */
		    
		    System.out.println(result);
		    
		    request.setAttribute("result", result);
		    
		    request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}
