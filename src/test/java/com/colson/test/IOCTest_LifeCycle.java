package com.colson.test;

import com.colson.bean.Car;
import com.colson.condition.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);

        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
        applicationContext.close();
    }
}
