package com.akoemov.spring_xml_conf.hello_world.main;


import com.akoemov.spring_xml_conf.hello_world.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("hello_world/SpringConfig.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");

        obj.printHelloWorld("This is example of Spring 4 Java Configuration");
    }
}