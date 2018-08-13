package com.binco.ssm.controller;

import com.binco.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/6 16:29
 * @description:
 */
@Controller
public class BookController {
    //@Qualifier("bookService")
    @Autowired
    private BookService bookService;

    public void print(){
        System.out.println(bookService);
    }
}
