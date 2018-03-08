package main.java.com.sxd.service.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Shixiaodong
 * @date 2018/3/8 21:40
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object o) throws Throwable {
            String clientName = (String)args[0];
            System.out.println("How old are you！" + clientName);
    }
}
