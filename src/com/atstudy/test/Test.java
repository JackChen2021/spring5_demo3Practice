package com.atstudy.test;

import com.atstudy.service.UserService;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author JackChern @create 2021-07-27 18:34
 */
public class Test {


    @org.junit.Test
    public void test1() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.show();

    }
    @org.junit.Test
    public void test2() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.show();

    }

    @org.junit.Test
    public void test3() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.show();

    }
}
