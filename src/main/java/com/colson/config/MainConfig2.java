package com.colson.config;

import com.colson.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig2 {

    /**
     * prototype :多实例的
     * singleton:单实例的（默认值）
     * request:同一个请求创建一个实例
     * session
     * @return
     */
    @Scope()
    @Bean
    public Person person(){
        return new Person("张三",25);
    }
}
