package com.akoemov.spring_java_conf.import_conf.conf;


import com.akoemov.spring_java_conf.import_conf.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Akoemov on 23.03.2016.
 */
@Configuration
@Import(SpringConfigLocal.class)
public class SpringConfigMain {

    @Bean(name = "B")
    public B b() {
        return new B();
    }

}