package com.windbag.aop.demo6;

import com.windbag.aop.demo3.StudentDao;

/**
 * Created by windbag7 on 2018/8/30.
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public void find() {
        System.out.println("学生查询");
    }

    @Override
    public void save() {
        System.out.println("学生保存");
    }

    @Override
    public void update() {
        System.out.println("学生修改");
    }

    @Override
    public void delete() {
        System.out.println("学生删除");
    }
}
