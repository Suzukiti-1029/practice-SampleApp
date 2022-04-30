<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>
<body>
  <%
    String str = new String("HelloWorld!");

    for (int i = 0; i < 5; i++) {
      out.print(str);
      out.println("<br>");
    }
  %>
</body>
</html>