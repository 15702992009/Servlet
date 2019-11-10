package cn.papop.listener.ServletContext;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * 接口:ServletContextAttributeListener作用:
 *      当一个ServletContext范围的属性被添加,删除或者替换时,该接口的方法将会被调用
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {
    /**
     *
     * @param servletContextAttributeEvent 该对象可以获取ServletContext增加属性的名称和值
     *                                     servletContextAttributeEvent类继承ServletContextAttribute并且增加两个方法
     *                                     java.lang.String getName()
     *                                     java.lang.Object getValue()
     */
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        //获取添加的属性名称
        String name = servletContextAttributeEvent.getName();
        //获取添加的属性值
        Object value = servletContextAttributeEvent.getValue();
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {

    }
}
