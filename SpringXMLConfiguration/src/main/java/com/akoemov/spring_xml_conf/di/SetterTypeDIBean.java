package com.akoemov.spring_xml_conf.di;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class SetterTypeDIBean {

    private ServiceBean serviceBean;

    // a setter method to inject the dependency.
    public void setServiceBean(ServiceBean serviceBean) {
        this.serviceBean = serviceBean;
    }

    public void useService() {
        System.out.println("SetterTypeDIBean:" + serviceBean.action());
    }
}
