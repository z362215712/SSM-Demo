package com.binco.ssm.config;

import com.binco.ssm.model.PersonModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/6 11:36
 * @description:
 */
@PropertySource(value = {"classpath:/person.properties"})
@Configuration
public class MainConfigPropertyValues {
    @Bean
    public PersonModel person(){
        return new PersonModel();
    }
}
