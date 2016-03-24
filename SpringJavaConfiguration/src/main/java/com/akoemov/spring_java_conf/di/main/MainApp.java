package com.akoemov.spring_java_conf.di.main;


import com.akoemov.spring_java_conf.di.ConstructorTypeDIBean;
import com.akoemov.spring_java_conf.di.SetterTypeDIBean;
import com.akoemov.spring_java_conf.di.conf.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        SetterTypeDIBean bean1 = (SetterTypeDIBean) context.getBean("setterTypeDIBean");
        bean1.useService();

        ConstructorTypeDIBean bean2 = (ConstructorTypeDIBean) context.getBean("constructorTypeDIBean");
        bean2.useService();
    }
}