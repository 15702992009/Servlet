package cn.papop.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * public @interface WebFilter {
 *     String description() default "";
 *
 *     String displayName() default "";
 *
 *     WebInitParam[] initParams() default {};
 *
 *     String filterName() default "";
 *
 *     String smallIcon() default "";
 *
 *     String largeIcon() default "";
 *
 *     String[] servletNames() default {}; 要拦截的servlet名称
 *
 *     String[] value() default {};
 *
 *     String[] urlPatterns() default {};
 *
 *     DispatcherType[] dispatcherTypes() default {DispatcherType.REQUEST};
 *
 *     boolean asyncSupported() default false;
 * }
 */
@WebFilter(filterName = "MyFilter")
public class MyFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
