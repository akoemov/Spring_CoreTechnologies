package com.akoemov.spring_xml_conf.di.main;


import com.akoemov.spring_xml_conf.di.ConstructorTypeDIBean;
import com.akoemov.spring_xml_conf.di.SetterTypeDIBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("di/SpringConfig.xml");

        SetterTypeDIBean bean1 = (SetterTypeDIBean) context.getBean("setterTypeDIBean");
        bean1.useService();

        ConstructorTypeDIBean bean2 = (ConstructorTypeDIBean) context.getBean("constructorTypeDIBean");
        bean2.useService();
    }
}