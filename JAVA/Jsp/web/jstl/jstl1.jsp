<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List list = new ArrayList();
        list.add("aaa");
        request.setAttribute("list",list);

        request.setAttribute("num",3);
    %>

    <c:if test="${not empty list}">
        遍历集合
    </c:if>

    <c:if test="${num%2 == 1}">
        shiji
    </c:if>
</body>
</html>
