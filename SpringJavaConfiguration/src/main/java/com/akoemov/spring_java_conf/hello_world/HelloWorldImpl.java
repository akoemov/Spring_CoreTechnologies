package com.akoemov.spring_java_conf.hello_world;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void printHelloWorld(String msg) {

        System.out.println("Hello : " + msg);
    }

}