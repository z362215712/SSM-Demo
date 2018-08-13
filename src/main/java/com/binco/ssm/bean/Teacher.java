package com.binco.ssm.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/9 10:17
 * @description:
 */
@Component
public class Teacher implements IPeople {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
