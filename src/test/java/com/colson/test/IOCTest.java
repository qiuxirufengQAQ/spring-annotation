package com.colson.test;

import com.colson.config.MainConfig;
import com.colson.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {

    @Test
    public void test02(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:definitionNames) {
            System.out.println(name);
        }
    }
}
