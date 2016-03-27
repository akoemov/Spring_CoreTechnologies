package com.akoemov.spring_xml_conf.di;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class ServiceBeanImpl implements ServiceBean {
    @Override
    public String action() {
        return "Use ServiceBean action method";
    }
}
