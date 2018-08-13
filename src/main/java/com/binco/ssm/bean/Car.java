package com.binco.ssm.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/27 14:08
 * @description:
 */
@Component
public class Car implements ApplicationContextAware {
    public Car() {
        System.out.println("car constructor");
    }

    public void init() {
        System.out.println("car init");
    }

    public void destory() {
        System.out.println("car destory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
