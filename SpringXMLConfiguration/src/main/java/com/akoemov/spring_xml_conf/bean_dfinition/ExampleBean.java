package com.akoemov.spring_xml_conf.bean_dfinition;

/**
 * Created by Akoemov on 23.03.2016.
 */
public class ExampleBean {

    private String forSetter = "default";

    private String forConstructor = "default";

    public ExampleBean(String forConstructor) {
        this.forConstructor = forConstructor;
    }

    public void setForSetter(String forSetter) {
        this.forSetter = forSetter;
    }

    public void init() {
        System.out.println("initialization method");
    }

    public void cleanup() {
        System.out.println("destruction method");
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "forSetter='" + forSetter + '\'' +
                ", forConstructor='" + forConstructor + '\'' +
                '}';
    }
}
