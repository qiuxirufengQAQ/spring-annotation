package com.colson.config;

import com.colson.bean.Color;
import com.colson.bean.ColorFactoryBean;
import com.colson.bean.Person;
import com.colson.condition.LinuxCondition;
import com.colson.condition.MyImportBeanDefinitionRegister;
import com.colson.condition.MyImportSelector;
import com.colson.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Conditional({WindowsCondition.class})
//@Configuration
@Import({MyImportSelector.class, MyImportBeanDefinitionRegister.class})
public class MainConfig2 {

    /**
     * prototype :多实例的
     * singleton:单实例的（默认值）
     * request:同一个请求创建一个实例
     * session
     *
     * @return
     */
    @Scope(value = "prototype")
    @Bean
    public Person person() {
        return new Person("张三", 25);
    }

    @Bean(name = "bill")
    public Person person01() {
        return new Person("Bill Gates", 67);
    }

    /**
     * @return
     * @Conditional,按照一定的条件进行判断，满足条件给容器中注册bean
     */
    @Conditional(LinuxCondition.class)
    @Bean(name = "linus")
    public Person person02() {
        return new Person("Linus", 49);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }


}
