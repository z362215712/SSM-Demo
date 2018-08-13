package com.binco.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/10 09:33
 * @description:
 */
@Configuration
@ComponentScan(value = "com.binco.ssm")
@EnableAspectJAutoProxy
public class MainConfigAll {
}
