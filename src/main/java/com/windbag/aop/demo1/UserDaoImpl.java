package com.windbag.aop.demo1;

/**
 * Created by windbag7 on 2018/8/30.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存用户");
    }

    @Override
    public void find() {
        System.out.println("查找用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }
}
