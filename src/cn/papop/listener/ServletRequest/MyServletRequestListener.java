package cn.papop.listener.ServletRequest;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.Enumeration;

/**
 * 监听器ServletRequestListener:
 *      对ServletRequest的创建和销毁事件进行响应
 */
@WebListener()
public class MyServletRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("--------MyServletRequestListener--Start-----");
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        String serverName = servletRequest.getServerName();
        System.out.println("serverName: "+serverName);
        System.out.println("--------MyServletRequestListener--Ended-----");

    }
}
