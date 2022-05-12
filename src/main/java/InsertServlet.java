import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utility.Utility;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
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
    	
    	Human rhi = new Human();
    	String info = "null";
    	
    	if (!Utility.isNullOrEmpty(birthPlace)) {
    		info = rhi.returnHumanInfo();
    	}else if (birthPlace.equals("日本")) {
    		info = rhi.returnHumanInfo();
			/*
			 * request.setAttribute("name", "名無し"); request.setAttribute("language", "日本語");
			 * request.setAttribute("birthPlace", "日本"); request.setAttribute("msg",
			 * "日本の公用語は「日本語」です。");
			 */
    	}else if (birthPlace.equals("アメリカ")) {
    		info = rhi.returnHumanInfo();
			/*
			 * request.setAttribute("name", "名無し"); request.setAttribute("language", "英語");
			 * request.setAttribute("birthPlace", "アメリカ"); request.setAttribute("msg",
			 * "アメリカの公用語は「英語」です。");
			 */
    	}
    	
    	request.setAttribute("info", info);


        // 結果画面へ
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}