package com.binco.ssm.controller;

import com.binco.ssm.model.TestModel;
import com.binco.ssm.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/16 14:25
 * @description:
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private ITestService testService;

    @RequestMapping("/index_page")
    public String showIndex(HttpServletRequest request, Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("__________id:" + id);
        TestModel test = this.testService.getModelById(id);
        //绑定对象到test/index.jsp
        model.addAttribute("test", test);
        return "test/index";
    }

    @RequestMapping("/index_api")
    @ResponseBody
    public TestModel Index(HttpServletRequest request, Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        return this.testService.getModelById(id);
    }
}
