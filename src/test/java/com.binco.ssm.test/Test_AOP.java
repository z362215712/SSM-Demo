package com.binco.ssm.test;

import com.binco.ssm.aop.MathCaculator;
import com.binco.ssm.config.MainConfigAll;
import com.binco.ssm.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/13 10:57
 * @description:
 */
public class Test_AOP {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);


    @Test
    public void testGetUserById() {
        MathCaculator bean = annotationConfigApplicationContext.getBean(MathCaculator.class);
        bean.div(4, 0);
        annotationConfigApplicationContext.close();

//        this.aopController = applicationContext.getBean(AOPController.class);
//        aopController.test();
    }
}
