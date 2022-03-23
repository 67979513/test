package com.luculent.net.springboot.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/*@Component注解是将该类交给spring的ioc容器来管理*/
@Component
/*@ConfigurationProperties注解表示属性配置类，目的就是将核心配置文件中的属性值读取出来*/
@ConfigurationProperties(prefix = "school")
/*将该类交给spring进行管理*/
public class School {

    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
