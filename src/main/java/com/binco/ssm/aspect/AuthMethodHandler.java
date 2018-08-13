package com.binco.ssm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: Qiaoguo Zhang
 * @date: 2018/8/9 17:07
 * @description:
 */
@Aspect
@Order(999)
@Component
public class AuthMethodHandler {
    /**
     * 对注释有AuthMethod的标记的方法,进行AOP切入拦截
     */
    @Pointcut("@annotation(com.binco.ssm.aspect.AuthMethod)")
    public void gatewayMethodPointcut() {

    }
    @Before("execution(* test(..))")
    public void sayHello() {
        System.out.println("——————————————say hello---------------------------");
    }


    @Before("gatewayMethodPointcut()")
    public void before() {
        System.out.println("——————————————METHOD Before ---------------------------");
    }

    @Around("gatewayMethodPointcut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("halo");
        // 拦截的实体类
        Object target = jp.getTarget();
        // 拦截的方法名称
        String methodName = jp.getSignature().getName();
        // 请求参数
        Object[] args = jp.getArgs();

        Object result = jp.proceed();

        System.out.println("[Aspect1] around advise2");

    }
}
