package SessionDelivery;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SampleSessionCtl2")
public class SampleSessionCtl2 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request,
  HttpServletResponse response) throws ServletException, IOException {
    String userName = request.getParameter("UserName");
    String gameName = request.getParameter("GameName");

    HttpSession session = request.getSession();
    session.setAttribute("UserName", userName);
    session.setAttribute("GameName", gameName);

    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>セッションの生成</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>セッションの生成（ページ１）</h1>");
    out.println("<p>あなたの名前は「" + userName + "」です。</p>");
    out.println("<p>好きなゲームは「" + gameName + "」です。</p>");
    out.println("<p>セッションIDは「" + session.getId() +"」です。</p>");
    out.println("<a href=\"/SampleApp/SampleSessionGetServlet2\">次のサーブレット呼び出し</a>");
    out.println("</body>");
    out.println("</html>");
  }
}
