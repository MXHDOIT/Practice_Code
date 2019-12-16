<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach begin="1" end="10" var="i" step="2">
        ${i}<br>
    </c:forEach>

    <%
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");

        request.setAttribute("list",list);
    %>


    <c:forEach items="${list}" varStatus="s" var="i">
        ${i} ${s.index} ${s.count}<br>
    </c:forEach>
</body>
</html>
