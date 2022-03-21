package Cookie;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RequestRecv2")
public class RequestRecv2 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request,
  HttpServletResponse response) throws ServletException, IOException {
    String gameName = request.getParameter("Game");

    Cookie cookGameTitle = new Cookie("GameTitle", gameName);
    cookGameTitle.setMaxAge(60*60*24);
    response.addCookie(cookGameTitle);

    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>あなたの回答</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>あなたの回答</h1>");
    out.println("好きなゲームは" + gameName + "です。<br><br>");

    out.println("では、そのゲームの好きなナンバリングは？<br>");
    out.println("<form action=\"SampleGetCookie\" method=\"post\">");
    out.println("<input type=\"text\" name=\"GameNumbering\" size=\"40\">");
    out.println("<input type=\"submit\" value=\"次のサーブレットを起動\">");
    out.println("</form>");

    out.println("</body>");
    out.println("</html>");
  }
}
