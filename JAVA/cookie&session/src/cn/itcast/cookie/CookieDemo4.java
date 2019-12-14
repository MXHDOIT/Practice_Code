package cn.itcast.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Cookie快速入门：
 *
 */

@WebServlet("/cookieDemo4")
public class CookieDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1.创建 Cookie对象
        Cookie c1 = new Cookie("msg", "hfhfh");
        c1.setMaxAge(30); // 将cookie持久化到硬盘，30秒后会自动删除cooKie文件
        c1.setMaxAge(-1); //将coolie
//        Cookie c2 = new Cookie("name", "zhangsan");
//        2.发送Cookie对象
        response.addCookie(c1);
//        response.addCookie(c2);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
