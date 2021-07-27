package com.atstudy.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author JackChern @create 2021-07-27 21:38
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDao add....");
    }
}
