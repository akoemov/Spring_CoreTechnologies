package com.akoemov.spring_java_conf.import_annotation.main;


import com.akoemov.spring_java_conf.import_annotation.A;
import com.akoemov.spring_java_conf.import_annotation.B;
import com.akoemov.spring_java_conf.import_annotation.conf.SpringConfigMain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigMain.class);
        // now both beans A and B will be available...
        A a = (A) context.getBean("A");
        B b = (B) context.getBean("B");


    }
}