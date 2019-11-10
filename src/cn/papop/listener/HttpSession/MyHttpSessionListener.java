package cn.papop.listener.HttpSession;
/**
 * TODO: HttpSession类的解析
 */

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
public class MyHttpSessionListener implements HttpSessionListener {
    /**
     *
     * @param httpSessionEvent 继承自java.util.Event
     */
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        HttpSession session = httpSessionEvent.getSession();
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }
}
