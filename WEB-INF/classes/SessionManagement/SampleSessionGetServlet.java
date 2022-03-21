package SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SampleSessionGetServlet")
public class SampleSessionGetServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request,
  HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    HttpSession session = request.getSession();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>セッションIDの取得</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>セッションIDの取得（ページ2）</h1>");
    out.println("<p>セッションIDは「" + session.getId() +"」です。</p>");
    out.println("<a href=\"/SampleApp/SampleSessionCtl\">前のサーブレットに戻る</a>");
    out.println("</body>");
    out.println("</html>");
  }
}
