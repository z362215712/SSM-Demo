package com.binco.ssm.aspect;

import java.lang.annotation.*;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/9 17:06
 * @description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthMethod {
    /**
     * 接口 funcId
     *
     * @return
     */
    String code();
}
