package cn.itcast.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置request编码
        request.setCharacterEncoding("utf-8");
        //获取参数Map
//        Map<String, String[]> parameterMap = request.getParameterMap();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");

        //先获取生成的验证码
        HttpSession session = request.getSession();
        String checkCode_session = (String)session.getAttribute("checkCode_session");
        //先判断验证码是否正确
        if(checkCode_session.equalsIgnoreCase(checkCode)){
            //忽略大小写比较
            //判断用户名和密码是否一致
            if("zhangsan".equals(username) && "123".equals(password)){
                //登录成功
                //存储用户信息
                session.setAttribute("username",username);
                //重定向到success.jsp
                response.sendRedirect(request.getContextPath()+"/success.jsp");

            }else{
                //存储提示信息到request
                request.setAttribute("cc_error","用户名或密码错误");
                //转发
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        }else{
            //验证码不一致
            //存储提示信息到request
            request.setAttribute("cc_error","验证码错误");
            //转发
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
