package com.akoemov.spring_xml_conf.bean_dfinition.main;


import com.akoemov.spring_xml_conf.bean_dfinition.ExampleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean_dfinition/SpringConfig.xml");
        ExampleBean bean = (ExampleBean) context.getBean("DefinitionBean");
        System.out.println(bean);
    }
}