package com.windbag.aop.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by windbag7 on 2018/8/30.
 */
public class MyJdkProxy implements InvocationHandler{
    private Object object;
    private String target = "save";

    public MyJdkProxy(Object object){
        this.object = object;
    }

    public Object createProxy(){

        Object proxy = Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(target.equals(method.getName())){
            System.out.println("权限校验");
            return method.invoke(object,args);
        }
        return method.invoke(object,args);
    }
}
