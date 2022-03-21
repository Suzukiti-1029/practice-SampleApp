import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SampleGetCookie")
public class SampleGetCookie extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest request,
  HttpServletResponse response) throws ServletException, IOException {
    Cookie[] cookies = request.getCookies();
    String gameTitle = "";
    String gameNumbering = request.getParameter("GameNumbering");

    if (cookies != null) {
      for (Cookie cook : cookies) {
        if (cook.getName().equals("GameTitle")) {
          gameTitle = cook.getValue();
        }
      }
    }

    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>クッキーサンプル</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>クッキーサンプル</h1>");
    out.println("好きなゲームは" + gameTitle + "です。<br>");
    out.println("ナンバリングは" + gameNumbering + "です。<br>");
    out.println("</body>");
    out.println("</html>");
  }
}
