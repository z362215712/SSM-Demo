package com.binco.ssm.service;

import com.binco.ssm.model.TestModel;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/16 14:02
 * @description:
 */

public interface ITestService {
    public TestModel getModelById(int id);
}
