package com.akoemov.spring_java_conf.bean_dfinition.main;


import com.akoemov.spring_java_conf.bean_dfinition.ExampleBean;
import com.akoemov.spring_java_conf.bean_dfinition.conf.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ExampleBean bean = (ExampleBean) context.getBean("DefinitionBean");
        System.out.println(bean);
    }
}