package com.binco.ssm.config;

import com.binco.ssm.controller.PersonController;
import com.binco.ssm.model.PersonModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/20 09:06
 * @description:
 */
@Configuration
@ComponentScan(value = "com.binco.ssm", useDefaultFilters = false, includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Service.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE , value = {PersonController.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM, value = {MyFilter.class })
})
public class MainConfig {
    @Bean(name = "PersonModel")
    public PersonModel Person() {
        return new PersonModel("Binco", 18);
    }
}
