package com.akoemov.spring_java_conf.di.conf;


import com.akoemov.spring_java_conf.di.ConstructorTypeDIBean;
import com.akoemov.spring_java_conf.di.ServiceBean;
import com.akoemov.spring_java_conf.di.ServiceBeanImpl;
import com.akoemov.spring_java_conf.di.SetterTypeDIBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Akoemov on 23.03.2016.
 */
@Configuration
public class SpringConfig {

    @Bean
    public ServiceBean serviceBean() {
        return new ServiceBeanImpl();
    }

    @Bean(name = "setterTypeDIBean")
    public SetterTypeDIBean setterBasedDIBean() {
        SetterTypeDIBean bean = new SetterTypeDIBean();
        bean.setServiceBean(serviceBean());
        return bean;
    }

    @Bean(name = "constructorTypeDIBean")
    public ConstructorTypeDIBean constructorBasedDIBean() {
        return new ConstructorTypeDIBean(serviceBean());
    }
}