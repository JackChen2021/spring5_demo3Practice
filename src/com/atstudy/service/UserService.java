package com.atstudy.service;

import com.atstudy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author JackChern @create 2021-07-27 18:33
 */
@Service
public class UserService {
    @Qualifier(value = "userDaoImpl2")
    @Autowired
 private UserDao userDao;

    public void show(){
        System.out.println("service show...");
        userDao.add();
    }
}
