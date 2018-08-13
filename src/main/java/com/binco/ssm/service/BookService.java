package com.binco.ssm.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/7 14:45
 * @description:
 */
@Service
@Primary
public class BookService {
    private String lable = "1";

    @Override
    public String toString() {
        return "BookService{" +
                "lable='" + lable + '\'' +
                '}';
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}
