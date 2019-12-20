package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //0.强转
        HttpServletRequest request = (HttpServletRequest)req;

        //1.获取资源请求路径
        String uri = ((HttpServletRequest) req).getRequestURI();
        //注意排除css，js图片文件
        if(uri.contains("/login.jsp")||uri.contains("/loginServlet")||uri.contains("/css/")||uri.contains("/js/")||uri.contains("/fonts/")||uri.contains("/checkCodeServlet")){
            chain.doFilter(req,resp);
        }else{
            //不包含，需要验证
            Object user = request.getSession().getAttribute("user");
            if(user != null){
                chain.doFilter(req,resp);
            }else{
                //没有登录。跳转登录页面
                req.setAttribute("login_msg","您尚未登录，请登录");
                req.getRequestDispatcher("/login.jsp").forward(request,resp);
            }

        }


//        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
