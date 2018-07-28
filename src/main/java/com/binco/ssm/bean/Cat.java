package com.binco.ssm.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/27 17:00
 * @description:
 */
public class Cat implements InitializingBean,DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Cat destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat afterPropertiesSet");
    }
}
