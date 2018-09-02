package com.windbag.aop.demo2;

/**
 * Created by windbag7 on 2018/8/30.
 */
public class ProductDao {
    public void save(){
        System.out.println("保存商品");
    }

    public void find(){
        System.out.println("查找商品");
    }

    public void delete(){
        System.out.println("删除商品");
    }

    public void update(){
        System.out.println("更新商品");
    }


}
