package com.colson.test;

import com.colson.bean.Color;
import com.colson.bean.Person;
import com.colson.config.MainConfig;
import com.colson.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class IOCTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void testImport() {
        printBeans(applicationContext);
        Color factoryBean = (Color) applicationContext.getBean("colorFactoryBean");
        System.out.println(factoryBean.getClass());
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test03() {
        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);
//        动态获取环境变量的值，win dow 10

        for (String name : namesForType) {
//            System.out.println(name);
        }

        Map<String, Person> personMap = applicationContext.getBeansOfType(Person.class);
        System.out.println(personMap);
    }

    @Test
    public void test02() {

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }

    @Test
    public void test01() {

        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : definitionNames) {
            System.out.println(name);
        }
    }
}
