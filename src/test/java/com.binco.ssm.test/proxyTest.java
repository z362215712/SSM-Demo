package com.binco.ssm.test;

import com.binco.ssm.controller.AOPController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/9 10:22
 * @description:
 */
@ContextConfiguration(locations = { "classpath:spring-mvc.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class proxyTest {
    @Autowired
    private AOPController aopController;


    @Test
    public void test1(){
        aopController.test();
    }
}
