package com.windbag.aop.demo2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by windbag7 on 2018/8/30.
 */
public class MyCglibProxy implements MethodInterceptor {
    private Object object;

    public MyCglibProxy(Object object){
        this.object = object;
    }

    public Object createProxy(){
        //1.创建核心类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(object.getClass());
        //3.设置回调
        enhancer.setCallback(this);
        //4.生成代理
        Object proxy = enhancer.create();

        return proxy;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if("save".equals(method.getName())){
            System.out.println("权限校验");
            return methodProxy.invokeSuper(proxy,args);
        }
        return methodProxy.invokeSuper(proxy,args);
    }
}
