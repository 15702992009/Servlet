package cn.papop.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * public interface ServletConfig {
 *     String getServletName();
 *
 *     ServletContext getServletContext();
 *
 *     String getInitParameter(String var1);
 *
 *     Enumeration<String> getInitParameterNames();
 * }
 */

public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
