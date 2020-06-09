package com.colson.config;


import com.colson.bean.Person;
import com.colson.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScans(value = {
        @ComponentScan(value = "com.colson", includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = BookService.class),
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
        }, useDefaultFilters = false)
})
//@ComponentScan value：指定要扫描的包
//excludeFilters = Filter[] ,指定扫描的时候按照什么规则排除哪些组件
//includeFilters = Filter[],指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION,按照注解方式引入
//FilterType.ASSIGNABLE_TYPE,按照给定的类型
//FilterType.ASPECTJ 使用ASPECTJ表达式，不常用
//FilterType.REGEX 使用正则表达式
//FilterType.CUSTOM 使用自定义类来校验哪些类可以加载,Filter必须实现TypeFilter
public class MainConfig {

   @Bean("person")
    public Person person01(){
       return new Person("lisi",24);
    }


}
