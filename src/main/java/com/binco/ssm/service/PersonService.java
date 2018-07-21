package com.binco.ssm.service;

import com.binco.ssm.dao.TestDao;
import com.binco.ssm.model.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/20 10:47
 * @description:
 */
@Service
public class PersonService {

    //@Autowired
    private TestDao testDao;

    public TestModel getModelById(int id) {
        return testDao.getModelById(id);
    }
}
