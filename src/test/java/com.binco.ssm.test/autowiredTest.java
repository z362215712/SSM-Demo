package com.binco.ssm.test;

import com.binco.ssm.bean.Boss;
import com.binco.ssm.bean.Car;
import com.binco.ssm.bean.Red;
import com.binco.ssm.config.MainConfigOfAutowired;
import com.binco.ssm.controller.BookController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/7 14:49
 * @description:
 */
public class autowiredTest {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public void test() {
        BookController bean = annotationConfigApplicationContext.getBean(BookController.class);
        System.out.println("Book Controller : " + bean);
//        BookService bean1 = annotationConfigApplicationContext.getBean(BookService.class);
//        System.out.println("Book Service : "+bean1);
        bean.print();
        //需要手动关闭单例模式下的bean
        //多例的此方法关不了
        annotationConfigApplicationContext.close();
    }

    @Test
    public void test1() {
        Boss bean = annotationConfigApplicationContext.getBean(Boss.class);
        System.out.println(bean);
        Car bean1 = annotationConfigApplicationContext.getBean(Car.class);
        System.out.println(bean1);
        annotationConfigApplicationContext.close();
    }

    @Test
    public void test2() {
        //需要手动关闭单例模式下的bean
        print(annotationConfigApplicationContext);
        Red red =annotationConfigApplicationContext.getBean(Red.class);
        System.out.println("测试："+red);

//        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
//        String property = environment.getProperty("person.nickname");
//        System.out.println("昵称:" + property);
        //多例的此方法关不了
        annotationConfigApplicationContext.close();
    }

    private void print(AnnotationConfigApplicationContext context) {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String name : beanDefinitionNames
                ) {
            System.out.println(name);
        }
    }

}
