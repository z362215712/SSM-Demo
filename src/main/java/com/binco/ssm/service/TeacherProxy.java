package com.binco.ssm.service;

import com.binco.ssm.bean.Teacher;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/9 10:18
 * @description:
 */
public class TeacherProxy implements InvocationHandler {
    private Object target;

    public Object createProxyInstance(Object target){
        this.target = target;

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
