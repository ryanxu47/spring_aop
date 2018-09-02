package com.windbag.aop.demo2;

import org.junit.Test;

/**
 * Created by windbag7 on 2018/8/30.
 */
public class SpringDemo2 {
    @Test
    public void demo1Test(){
        ProductDao productDao = new ProductDao();

        ProductDao proxy = (ProductDao) new MyCglibProxy(productDao).createProxy();
        productDao.save();
        productDao.delete();
        productDao.find();
        productDao.update();

        proxy.save();
    }
}
