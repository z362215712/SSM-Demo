package com.binco.ssm.bean;

import com.binco.ssm.model.Color;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/27 11:42
 * @description:
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
