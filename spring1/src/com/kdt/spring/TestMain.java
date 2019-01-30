package com.kdt.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2018/12/24
 * AT 14:19
 **/
public class TestMain {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld hw = (HelloWorld) ctx.getBean("helloWorld");
        hw.syaHello();
    }
}
