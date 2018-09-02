package com.windbag.aop.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by windbag7 on 2018/8/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo6Test {
    @Resource(name="studentDao")
    private StudentDao studentDao;

    @Resource(name="customerDao")
    private CustomerDao customerDao;

    @Test
    public void test(){
        customerDao.save();
    }
}
