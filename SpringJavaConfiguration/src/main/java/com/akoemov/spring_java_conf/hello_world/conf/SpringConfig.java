package com.akoemov.spring_java_conf.hello_world.conf;


import com.akoemov.spring_java_conf.hello_world.HelloWorld;
import com.akoemov.spring_java_conf.hello_world.HelloWorldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Akoemov on 23.03.2016.
 */
@Configuration
public class SpringConfig {

    @Bean(name = "helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }

}