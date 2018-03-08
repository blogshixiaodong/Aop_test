package main.java.com.sxd.service;

/**
 * @author Shixiaodong
 * @date 2018/3/8 19:09
 */
public class PerformanceMonitor {
    private static ThreadLocal<MethodPerformance> performanceThreadLocal = new ThreadLocal<MethodPerformance>();

    public static void begin(String method) {
        System.out.println("Begin monitor...");
        MethodPerformance mp = new MethodPerformance(method);
        performanceThreadLocal.set(mp);
    }

    public static void end() {
        System.out.println("End monitor.");
        MethodPerformance mp = performanceThreadLocal.get();
        mp.printPerformance();
    }
}
