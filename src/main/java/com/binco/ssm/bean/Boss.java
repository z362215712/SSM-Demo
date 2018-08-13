package com.binco.ssm.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/7 16:23
 * @description:
 */
@Component
public class Boss {
    private Car car;

    public Car getCar() {
        return car;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
