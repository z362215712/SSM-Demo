package com.binco.ssm.config;

import com.binco.ssm.bean.Car;
import com.binco.ssm.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/27 14:08
 * @description:
 */
@ComponentScan("com.binco.ssm")
@Configuration
public class MainConfigOfLifeCycle {
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }
}
