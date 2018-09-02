package com.windbag.aop.demo5;

import com.windbag.aop.demo3.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by windbag7 on 2018/8/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo3 {

    @Resource(name="studentDao")
    private StudentDao studentDao;

    @Test
    public void demo1Test(){
        studentDao.save();
        studentDao.delete();
        studentDao.find();
        studentDao.update();
    }
}
