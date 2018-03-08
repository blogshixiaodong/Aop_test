package test;

import main.java.com.sxd.service.*;
import main.java.com.sxd.service.advice.GreetingBeforeAdvice;
import main.java.com.sxd.service.impl.UserServiceImpl;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Proxy;

/**
 * @author Shixiaodong
 * @date 2018/3/8 19:38
 */
public class ProxyTest {

    public static void main(String[] args) {
        //JDK基于接口代理
//        UserService userService = new UserServiceImpl();
//        PerformanceHandle performanceHandle = new PerformanceHandle(userService);
//        UserService proxyUserService = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), performanceHandle);
//        proxyUserService.add();
//        UserService userService1 = (UserService) performanceHandle.get();
//        userService1.add();

        //Cglib动态代理
//        CglibProxy proxy = new CglibProxy();
//        UserService userService1 = (UserService) proxy.getProxy(UserServiceImpl.class);
//        userService1.add();

        Waiter waiter = new NativeWaiter();
        BeforeAdvice advice = new GreetingBeforeAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(waiter);
        proxyFactory.addAdvice(advice);

        Waiter proxyWaiter =(Waiter) proxyFactory.getProxy();
        proxyWaiter.greetTo("Shixiaodong");


    }
}
