package com.colson.config;

import com.colson.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValues {

    @Bean
    public Person person(){
        return new Person();
    }
}
