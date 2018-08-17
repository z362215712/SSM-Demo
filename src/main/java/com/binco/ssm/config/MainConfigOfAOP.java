package com.binco.ssm.config;

import com.binco.ssm.aop.LogAspects;
import com.binco.ssm.aop.MathCaculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/13 10:12
 * @description:
 * 2、
 */
@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAOP {
    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }

    @Bean
    public MathCaculator mathCaculator() {
        return new MathCaculator();
    }
}
