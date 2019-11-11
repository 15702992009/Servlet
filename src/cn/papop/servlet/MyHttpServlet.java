package cn.papop.servlet;
/**
 * 请求转发:getRequestDispatcher方法是ServletRequest接口的方法
 * interface HttpServletRequest extends ServletRequest
 *
 * 重定向方式下的两种参数表达方式的区别:
 * 1.  response.sendRedirect("jsp/1.jsp"); URL: http://localhost:8080/app12/jsp/1.jsp
 * web项目下的相对路径:web下的jsp文件夹下的1.jsp文件
 * 2. response.sendRedirect("/jsp/1.jsp"); URL-> http://localhost:8080/jsp/1.jsp
 * 端口号下的相对路径
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyHttpServlet", urlPatterns = {"/myHttpServlet"})
public class MyHttpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求转发,url不变
//        request.getRequestDispatcher("/jsp/myHttpServlet.jsp").forward(request, response);
        //重定向,url改变
        response.sendRedirect("jsp/myHttpServlet.jsp");
    }
}
