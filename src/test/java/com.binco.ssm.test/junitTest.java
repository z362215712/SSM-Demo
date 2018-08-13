package com.binco.ssm.test;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/9 17:53
 * @description:
 */
import com.binco.ssm.config.MainConfigAll;
import com.binco.ssm.controller.AOPController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class junitTest {
    //@Autowired
    private AOPController aopController;

    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigAll.class);
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:*.xml");

    @Before
    public void init() {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath*:*.xml");
//        AOPController aopController = classPathXmlApplicationContext.getBean(AOPController.class);
//        this.aopController = aopController;
//        classPathXmlApplicationContext.close();

        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //this.aopController = annotationConfigApplicationContext.getBean(AOPController.class);


    }

    @Test
    public void testGetUserById() {
        this.aopController = annotationConfigApplicationContext.getBean(AOPController.class);
        aopController.test();

//        this.aopController = applicationContext.getBean(AOPController.class);
//        aopController.test();
    }
}
