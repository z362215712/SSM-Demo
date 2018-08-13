package com.binco.ssm.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/7 17:15
 * @description:
 */
@Component
public class Red implements ApplicationContextAware, BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("bean 的name ："+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("上下文 ："+applicationContext);
    }
}
