package com.akoemov.spring_xml_conf.import_conf.main;


import com.akoemov.spring_xml_conf.import_conf.A;
import com.akoemov.spring_xml_conf.import_conf.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("import_conf/SpringConfigMain.xml");

        // now both beans A and B will be available...
        A a = (A) context.getBean("A");
        B b = (B) context.getBean("B");

        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
    }
}