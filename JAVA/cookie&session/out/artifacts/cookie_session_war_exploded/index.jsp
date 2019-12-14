<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 13/12/2019
  Time: 下午 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%
    System.out.println("dadas");

    String contextPath = request.getContextPath();
    out.print(contextPath);
  %>

  <%!
     int i = 3;

  %>

  <%= "hello dasd"%>
  <% response.getWriter().write("llll");%>

      <h1>hhhhhhh</h1>
  </body>
</html>
