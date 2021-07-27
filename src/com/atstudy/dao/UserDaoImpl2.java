package com.atstudy.dao;

import org.springframework.stereotype.Repository;

/**
 * @author JackChern @create 2021-07-27 21:47
 */
@Repository
public class UserDaoImpl2 implements UserDao{

    @Override
    public void add() {
        System.out.println("我是2222的add呀！！！！！");
    }
}
