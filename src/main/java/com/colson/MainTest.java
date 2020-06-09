package com.colson;

import com.colson.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }

    }
}
