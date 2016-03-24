package com.akoemov.spring_java_conf.di;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class ConstructorTypeDIBean {

    private ServiceBean serviceBean;

    public ConstructorTypeDIBean(ServiceBean serviceBean) {
        this.serviceBean = serviceBean;
    }

    public void useService() {
        System.out.println("ConstructorTypeDIBean:" + serviceBean.action());
    }
}
