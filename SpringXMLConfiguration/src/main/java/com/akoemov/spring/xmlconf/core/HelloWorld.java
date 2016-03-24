package com.akoemov.spring.xmlconf.core;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Spring 4 : Hello ! " + name);
    }
}