package com.colson.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

// 判断是否是linux系统
public class LinuxCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        1、能获取到ioc使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
//        2、获取类加载器
        ClassLoader classLoader = context.getClassLoader();
//        3、获取当前环境信息
        Environment environment = context.getEnvironment();
//        4、获取到bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        String systemName = environment.getProperty("os.name");

//        可以判断容器中的bean注册情况，也可以给容器中注册bean
        if (systemName.contains("linux")) {
            return true;
        }
        return false;
    }
}