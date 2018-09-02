package com.windbag.aop.demo5;

/**
 * Created by windbag7 on 2018/8/31.
 */
public class CustomerDao {
    public void find(){
        System.out.println("查询客户");
    }

    public void save(){
        System.out.println("保存用户");
    }

    public void update(){
        System.out.println("修改用户");
    }

    public void delete(){
        System.out.println("删除用户");
    }
}
