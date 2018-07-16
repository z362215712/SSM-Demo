package com.binco.ssm.dao;

import com.binco.ssm.model.TestModel;
import org.springframework.stereotype.Repository;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/16 14:02
 * @description:
 */
@Repository
public interface TestDao {
    TestModel getModelById(int id);
}
