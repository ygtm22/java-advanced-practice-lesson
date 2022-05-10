import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	// ここに必要な処理を記述してください。
    	request.setCharacterEncoding("UTF-8");
    	
    	String name = request.getParameter("name");
    	String language = request.getParameter("language");
    	String birthPlace = request.getParameter("birthPlace");
    	
    	
    	
    	String info = "null";
    	
    	if (birthPlace.equals("")) {
    		Human rhi = new Human();
    		info = rhi.returnHumanInfo();
    	}else if (birthPlace.equals("japan")) {
    		Japanese japan = new Japanese();
    		info = japan.returnHumanInfo();
    	}else if (birthPlace.equals("america")) {
    		Amerian america = new Amerian();
    		info = america.returnHumanInfo();
    	}
    	
    	if (birthPlace.equals("")) {
    		Human rhi = new Human(name , language);
    		info = rhi.returnHumanInfo();
    	}else if (birthPlace.equals("japan")) {
    		Japanese japan = new Japanese(name , language);
    		info = japan.returnHumanInfo();
    	}else if (birthPlace.equals("america")) {
    		Amerian america = new Amerian(name , language);
    		info = america.returnHumanInfo();
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	request.setAttribute("info", info);


        // 結果画面へ
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}