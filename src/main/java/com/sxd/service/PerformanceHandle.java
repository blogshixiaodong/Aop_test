package main.java.com.sxd.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Shixiaodong
 * @date 2018/3/8 19:30
 */
public class PerformanceHandle implements InvocationHandler {
    private Object target;
    private Object proxy;
    public PerformanceHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName() + "." + method.getName());
        Object obj = method.invoke(target, args);
        PerformanceMonitor.end();
        this.proxy = proxy;
        return obj;
    }

    //代理类
    public Object get() {
        return proxy;
    }
}
