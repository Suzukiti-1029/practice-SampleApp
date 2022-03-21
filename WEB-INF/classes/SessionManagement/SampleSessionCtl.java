package SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SampleSessionCtl")
public class SampleSessionCtl extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request,
  HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    HttpSession session = request.getSession();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>セッションの生成</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>セッションの生成（ページ１）</h1>");
    out.println("<p>セッションIDは「" + session.getId() + "」です。</p>");
    out.println("<a href=\"SampleSessionGetServlet\">次のサーブレット呼び出し</a>");
    out.println("</body>");
    out.println("</html>");
  }
}
