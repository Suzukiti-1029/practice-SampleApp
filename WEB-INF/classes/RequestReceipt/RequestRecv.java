package RequestReceipt;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RequestRecv")
public class RequestRecv extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request,
  HttpServletResponse response) throws ServletException, IOException {
    String gameName = request.getParameter("Game");
    String hardName = request.getParameter("Hard");

    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");
    out.println("<title>あなたの回答</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>あなたの回答</h1>");
    out.println("好きなゲームは" + gameName + "です。");
    out.println("初めて購入したハードは" + hardName + "です。");
    out.println("</body>");
    out.println("</html>");

  }
}
