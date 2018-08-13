package com.binco.ssm.config;

import com.binco.ssm.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/7 14:46
 * @description:
 */
@Configuration
@ComponentScan(value = {"com.binco.ssm.service","com.binco.ssm.controller",
"com.binco.ssm.bean"})
public class MainConfigOfAutowired {

    @Bean("bookService")
    public BookService bookService(){
        BookService bookService = new BookService();
        bookService.setLable("2");
        return bookService;
    }
}
