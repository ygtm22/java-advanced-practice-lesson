package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartAppServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	request.setCharacterEncoding("UTF-8");
    	
    	String name = request.getParameter("name");
	    String game = request.getParameter("application");
    
    	
    	
    	String result = "";
    	
    	
    	
    	App app = null;
		 
    	if (game.equals("card")) {
    		CardGameApp card = new CardGameApp("トランプ");
    		result = card.start(name);
    		app = card;
    		//result += card.play();
    	}else if (game.equals("darts")) {
    		DartsGameApp darts = new DartsGameApp("ダーツ");
    		result = darts.start(name);
    		app = darts;
    		//result += darts.play();
    	}else if (game.equals("clock")) {
    		ClockApp clock = new ClockApp();
    		result = clock.start(name);
    	}else if (game.equals("others")) {
    		result = "アプリの実行に失敗しました。";
    	}
    	
    	GameApp gameApp = (GameApp) app;
    	
		 if (app instanceof GameApp) { 
			 request.setAttribute("playTime", "実行時間：" + gameApp.getPlayTime() + "分");
		}
    	
		/*
		 * if (game.equals("card")) { CardGameApp card = new CardGameApp(); result =
		 * card.start(name); }else if (game.equals("darts")) { DartsGameApp darts = new
		 * DartsGameApp(); result = darts.start(name); }else if (game.equals("clock")) {
		 * ClockApp clock = new ClockApp(); result = clock.start(name); }
		 */
    	
    	request.setAttribute("result", result);
    	
    	request.getRequestDispatcher("/appStart.jsp").forward(request, response);
    }
}
