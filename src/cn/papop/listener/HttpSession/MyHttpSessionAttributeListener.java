package cn.papop.listener.HttpSession;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * 接口:HttpSessionAttributeListener的作用:
 *      当HttpSession对象属性增肌,删除,替换时
 *      激活所有实现了HttpSessionAttributeListener接口的监听器
 */
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {
    /**
     *
     * @param httpSessionBindingEvent:用于获取属性的名称和值
     *                               httpSessionBindingEvent是httpSessionEvent的子类
     *                               所以可以获取httpSession对象: ttpSession session = httpSessionBindingEvent.getSession();
     */
    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();
        HttpSession session = httpSessionBindingEvent.getSession();
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
