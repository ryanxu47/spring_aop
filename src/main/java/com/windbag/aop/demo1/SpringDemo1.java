package com.windbag.aop.demo1;

import org.junit.Test;

/**
 * Created by windbag7 on 2018/8/30.
 */
public class SpringDemo1 {
    @Test
    public void demo1Test(){
        UserDao userDao = new UserDaoImpl();

        UserDao proxy = (UserDao) new MyJdkProxy(userDao).createProxy();

        userDao.save();
        userDao.update();
        userDao.delete();
        userDao.find();

        proxy.save();
    }
}
