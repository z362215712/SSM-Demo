package com.binco.ssm.test;

import com.binco.ssm.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/27 14:17
 * @description:
 */
public class lifeCycleTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        //需要手动关闭单例模式下的bean
        //多例的此方法关不了
        annotationConfigApplicationContext.close();
    }
}


