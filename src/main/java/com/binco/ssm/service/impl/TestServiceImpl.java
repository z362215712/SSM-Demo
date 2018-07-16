package com.binco.ssm.service.impl;

import com.binco.ssm.dao.TestDao;
import com.binco.ssm.model.TestModel;
import com.binco.ssm.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/16 14:07
 * @description:
 */
@Service
public class TestServiceImpl implements ITestService {
    @Autowired
    private TestDao testDao;

    @Override
    public TestModel getModelById(int id) {
        return testDao.getModelById(id);
    }
}
