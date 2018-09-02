package com.windbag.aop.demo5;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by windbag7 on 2018/8/30.
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("这是前置通知");
    }
}
