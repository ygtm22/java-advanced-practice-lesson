package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        // 入力値取得
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");

        if (name != null && !name.isEmpty()) {
            // GameAppクラスのオブジェクトを作成
            // (引数付きコンストラクタで、itemフィールドに "何か" をセット)
            GameApp app = new GameApp("何か");

            // GameAppオブジェクトのstartメソッドを呼ぶ
            String result = app.start(name);

            // リクエストスコープへセット
            request.setAttribute("result", result);
        }

        request.getRequestDispatcher("appStart.jsp").forward(request, response);
    }
}