package com.akoemov.spring_java_conf.import_annotation.conf;

import com.akoemov.spring_java_conf.import_annotation.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Akoemov on 23.03.2016.
 */
@Configuration
public class SpringConfigLocal {

    @Bean(name = "A")
    public A a() {
        return new A();
    }

}
