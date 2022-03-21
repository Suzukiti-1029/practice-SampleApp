package HelloWorld;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request,
  HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Encoding Sample</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Encoding Sample</h1>");
    out.println("<p>こんにちは。</p>");
    out.println("</body></html>");
  }
}
