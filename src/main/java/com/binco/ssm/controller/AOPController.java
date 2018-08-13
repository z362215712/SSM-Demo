package com.binco.ssm.controller;

import com.binco.ssm.aspect.AuthMethod;
import org.springframework.stereotype.Controller;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/9 17:11
 * @description:
 */
@Controller
public class AOPController  {

    @AuthMethod(code="1001")
    public void test(){
        System.out.println("此处为1001");
    }
}
