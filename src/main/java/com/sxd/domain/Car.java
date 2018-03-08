package main.java.com.sxd.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.annotation.Order;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

/**
 * @author Shixiaodong
 * @date 2018/3/7 11:04
 */
public class Car implements InitializingBean, DisposableBean {
    private Wheel wheel;
    private String brand;
    private String color;
    private String maxSpeed;
    private Integer weight;
    public Car() {
        System.out.println("Car init");
    }
    public Car(String brand, String color, String maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }



    public void introduce() {
        System.out.println("Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", weight='" + weight + '\'' +
                '}');
    }

    public void init() {
        System.out.println("native initializing method.");
    }



    @PostConstruct
    public void inits() {

        System.out.println("Annotation initializing method.");
    }



    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Interface InitializingBean.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Interface DisposableBean.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
