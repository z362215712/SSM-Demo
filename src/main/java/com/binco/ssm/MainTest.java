package com.binco.ssm;

import com.binco.ssm.bean.Teacher;
import com.binco.ssm.controller.AOPController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/19 18:03
 * @description:
 */
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/*.xml");
        Teacher teacher = applicationContext.getBean(Teacher.class);
        teacher.sayHello();

        AOPController aopController = applicationContext.getBean(AOPController.class);
        aopController.test();

//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        AOPController bean = annotationConfigApplicationContext.getBean(AOPController.class);
//        bean.test();

    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        List list = new ArrayList<>(3);
//        ListNode listNode = new ListNode(1);
//        for (Integer i: l1)
//        list.add();
//    }
}