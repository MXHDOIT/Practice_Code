<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //设置响应的消息体的数据格式以及编码
    response.setContentType("text/html;charset=utf-8");

    //没有cookie为lastTime
    boolean flag = false;

    //1.获取所有Cookie
    Cookie[] cs = request.getCookies();

    //2.遍历cookie数组
    if(cs != null && cs.length > 0){
        for(Cookie c:cs){
            //3.获取cookie的名称
            String name = c.getName();

            //4.判断名称是否是：lastTime
            if("lastTime".equals(name)){
                flag = true;//有lastTime的cookie

                //设置Cookie的value
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                String format = sdf.format(date);
                //URL编码
                System.out.println("编码前："+format);
                format = URLEncoder.encode(format, "utf-8");
                System.out.println("编码后："+format);
                c.setValue(format);

                //设置cookie的存活时间
                c.setMaxAge(60*60*24*30);
                response.addCookie(c);

                //响应数据
                //获取Cookie的value，时间
                String value = c.getValue();
                //URL解码：
                System.out.println("解码前："+value);
                value = URLDecoder.decode(value, "utf-8");
                System.out.println("解码后："+value);
%>
 <h1>欢迎回来，您上次访问时间为：<%=value%></h1>
<%
                break;
            }
        }
    }

    if(cs == null || cs.length ==0||flag == false){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(date);

        System.out.println("编码前："+format);
        format = URLEncoder.encode(format, "utf-8");
        System.out.println("编码后："+format);

        final Cookie c = new Cookie("lastTime", format);
        c.setValue(format);
        c.setMaxAge(60*60*24*30);
        response.addCookie(c);
        %>
<h1>您好，欢迎您首次访问</h1>
<%
    }

%>

</body>
</html>
