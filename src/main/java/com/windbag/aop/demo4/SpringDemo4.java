package com.windbag.aop.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by windbag7 on 2018/8/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo4 {

    /*@Resource(name="customerDao")*/
    @Resource(name="customerDaoProxy")
    private CustomerDao customerDao;

    @Test
    public void demo1Test(){
        customerDao.save();
        customerDao.delete();
        customerDao.find();
        customerDao.update();
    }
}
