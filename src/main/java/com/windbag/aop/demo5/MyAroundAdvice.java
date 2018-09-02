package com.windbag.aop.demo5;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by windbag7 on 2018/8/31.
 */
public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕前通知================");

        /*执行目标方法*/
        Object obj = invocation.proceed();

        System.out.println("环绕后通知================");
        return obj;
    }
}
