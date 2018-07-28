package com.binco.ssm.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/7/27 16:31
 * @description:
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.binco.ssm.bean.Car", "com.binco.ssm.bean.ColorFactoryBean"};
    }
}
