package com.binco.ssm.config;

import com.binco.ssm.bean.ColorFactoryBean;
import com.binco.ssm.condition.LinuxCondition;
import com.binco.ssm.condition.MyImportSelector;
import com.binco.ssm.condition.WindowsCondition;
import com.binco.ssm.controller.PersonController;
import com.binco.ssm.model.PersonModel;
import com.binco.ssm.model.TestModel;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/20 14:47
 * @description:
 */
@Configuration
@Import({TestModel.class, MyImportSelector.class})
public class MainConfig2 {
    @Bean(name = "Person")
    //@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Lazy
    public PersonModel Person() {
        System.out.println("halo");
        return new PersonModel("Binco", 18);
    }

    @Conditional({WindowsCondition.class})
    @Bean(name = "Bill Gates")
    public PersonModel Person1() {
        return new PersonModel("Bill Gates", 18);
    }

    @Conditional({LinuxCondition.class})
    @Bean(name = "Linus")
    public PersonModel Person2() {
        return new PersonModel("Linus", 20);
    }

//    @Bean
//    public ColorFactoryBean colorFactoryBean() {
//        return new ColorFactoryBean();
//    }

}
