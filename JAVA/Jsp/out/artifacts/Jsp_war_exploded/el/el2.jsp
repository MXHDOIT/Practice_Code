<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        User user = new User();
        user.setName("账单");
        user.setBrithday(new Date());
        user.setAge(23);

        request.setAttribute("u",user);

        Map map = new HashMap();
        map.put("sname","李四");
        map.put("gender","男");
        map.put("user",user);

        request.setAttribute("map",map);
    %>


${u.age}
${u.brithday}
${map.sname}
</body>
</html>
