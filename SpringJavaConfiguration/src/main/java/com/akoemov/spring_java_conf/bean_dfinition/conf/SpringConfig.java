package com.akoemov.spring_java_conf.bean_dfinition.conf;


import com.akoemov.spring_java_conf.bean_dfinition.ExampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * Created by Akoemov on 23.03.2016.
 */
@Configuration
public class SpringConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup", name = "DefinitionBean")
    @Scope("singleton")
    @Lazy(false)
    public ExampleBean helloWorld() {
        ExampleBean bean = new ExampleBean("Set value by constructor");
        bean.setForSetter("Set value by setter");
        return bean;
    }

}