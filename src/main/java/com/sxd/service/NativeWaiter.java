package main.java.com.sxd.service;

import java.awt.*;

/**
 * @author Shixiaodong
 * @date 2018/3/8 21:39
 */
public class NativeWaiter implements Waiter {
    @Override
    public void greetTo(String name) {
        System.out.println("Greet to " + name);
    }

    @Override
    public void serviceTo(String name) {
        System.out.println("Service to " + name);
    }
}
