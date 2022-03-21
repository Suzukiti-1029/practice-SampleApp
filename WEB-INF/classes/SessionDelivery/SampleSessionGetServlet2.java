package SessionDelivery;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SampleSessionGetServlet2")
public class SampleSessionGetServlet2 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request,
  HttpServletResponse response) throws ServletException, IOException {
    String userName = "";
    String gameName = "";

    HttpSession session = request.getSession();
    userName = (String) session.getAttribute("UserName");
    gameName = (String) session.getAttribute("GameName");

    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>セッションオブジェクトの取得</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>セッションオブジェクトの取得（ページ２）</h1>");
    out.println("<p>あなたの名前は「" + userName + "」です。</p>");
    out.println("<p>好きなゲームは「" + gameName + "」です。</p>");
    out.println("<p>セッションIDは「" + session.getId() +"」です。</p>");
    out.println("<a href=\"/SampleApp/SampleSessionCtl2\">前のサーブレットに戻る</a>");
    out.println("</body>");
    out.println("</html>");
  }
  
}
