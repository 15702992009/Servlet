## chapter 8 监听器
###  Overview
1. Servlet API提供了一系列的事件和事件监听接口,上层的servlet/jsp应用能够通过调用这些API进行事件驱动的开发
2. 这里监听的所有事件都继承自java.util.Event对象
3. 监听器的接口可以分为三类:
    1. ServletContext
    2. ServletRequest
    3. HttpSession
4. 本章接受servlet/jsp应用中使用监听器

### 1. 监听器的编写
1. 监听器接口主要在 javax.servlet 和 javax.servlet.http包中

### 2. 监听器的注册
1. 编写实现监听器接口的实现类,在类上使用@WebListener注解
2. 在部署描述文档中增加一个listener元素

        <listener>
            <listener-class>cn.papop.listener.HttpSession.MyHttpSessionAttributeListener</listener-class>
        </listener>
        <listener>
            <listener-class>cn.papop.listener.ServletContext.MyServletContextListener</listener-class>
        </listener>


