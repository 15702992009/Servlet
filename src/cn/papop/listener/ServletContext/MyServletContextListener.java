package cn.papop.listener.ServletContext;
/**
 *TODO:
 *      1. 学习ServletContext
 *      2. 学习ServletContextEvent
 */
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 * 接口:ServletContextListener能对ServletContext的创建和销毁做出相应
 */
public class MyServletContextListener implements ServletContextListener {
    /**
     *
     * @param servletContextEvent 定义了一个访问ServletContext的方法:getServletContext()
     *                             ServletContext servletContext = servletContextEvent.getServletContext();
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
    }

    /**
     *
     * @param servletContextEvent 定义了一个访问ServletContext的方法:getServletContext()
     *                            ServletContext servletContext = servletContextEvent.getServletContext();
     */
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
