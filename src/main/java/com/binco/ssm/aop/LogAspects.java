package com.binco.ssm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/13 10:14
 * @description:
 */
@Aspect
public class LogAspects {
    @Pointcut("execution(public int com.binco.ssm.aop.MathCaculator.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("方法名：" + joinPoint.getSignature().getName());
        System.out.println("参数列表：" + Arrays.asList(joinPoint.getArgs()));
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturning(Object result) {
        System.out.println("结果是" + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
        System.out.println("" + joinPoint.getSignature().getName() + "异常。。。异常信息：{" + exception + "}");
    }
}
