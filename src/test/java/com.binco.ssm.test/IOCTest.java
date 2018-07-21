package com.binco.ssm.test;

import com.binco.ssm.config.MainConfig;
import com.binco.ssm.config.MainConfig2;
import com.binco.ssm.model.PersonModel;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/20 09:38
 * @description:
 */
public class IOCTest {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    @SuppressWarnings("resource")
    public void testIOC() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }

    @Test
    public void testScope() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainConfig2.class);
        PersonModel bean = annotationConfigApplicationContext.getBean(PersonModel.class);
        PersonModel bean2 = annotationConfigApplicationContext.getBean(PersonModel.class);
        System.out.println(bean == bean2);
    }

    @Test
    public void testConditional() {
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();

        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
