package main.java.com.sxd.service;

/**
 * @author Shixiaodong
 * @date 2018/3/8 19:12
 */
public class MethodPerformance {
    private Long begin;
    private Long end;
    private String serviceMethod;

    public MethodPerformance(String serviceMethod) {
        rest(serviceMethod);
    }

    public void printPerformance() {
        end = System.currentTimeMillis();
        Long elapse = end - begin;
        System.out.println(serviceMethod + "花费" + elapse + "毫秒。");
    }

    public void rest(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }
}
