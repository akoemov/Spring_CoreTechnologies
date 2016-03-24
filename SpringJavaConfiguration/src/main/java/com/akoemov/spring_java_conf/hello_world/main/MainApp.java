package com.akoemov.spring_java_conf.hello_world.main;


import com.akoemov.spring_java_conf.hello_world.HelloWorld;
import com.akoemov.spring_java_conf.hello_world.conf.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");

        obj.printHelloWorld("This is example of Spring 4 Java Configuration");
    }
}