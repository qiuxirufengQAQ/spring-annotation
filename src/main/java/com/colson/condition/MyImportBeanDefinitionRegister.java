package com.colson.condition;

import com.colson.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegister  implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean definition = registry.containsBeanDefinition("com.colson.bean.Red");
        boolean definition1 = registry.containsBeanDefinition("com.colson.bean.Blue");
        if(definition && definition1){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            beanDefinition.setScope("singleton");
//            beanDefinition.set
            registry.registerBeanDefinition("rainBow",beanDefinition);
        }
    }
}
