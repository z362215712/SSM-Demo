package com.binco.ssm.test;

import com.binco.ssm.config.MainConfigPropertyValues;
import com.binco.ssm.model.PersonModel;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/6 11:38
 * @description:
 */
public class propertyValueTest {
    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigPropertyValues.class);

    @Test
    public void test() {
        //需要手动关闭单例模式下的bean
        print(annotationConfigApplicationContext);
        PersonModel personModel = (PersonModel) annotationConfigApplicationContext.getBean("person");
        System.out.println(personModel);

        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
        String property = environment.getProperty("person.nickname");
        System.out.println("昵称:"+property);
        //多例的此方法关不了
        annotationConfigApplicationContext.close();
    }

    private void print(AnnotationConfigApplicationContext context){
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String  name :beanDefinitionNames
             ) {
            System.out.println(name);
        }
    }
}
