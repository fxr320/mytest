package com.day18.reflect.test;

import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by admin on 2019/1/23
 * AT 20:37
 **/
public class TestClass {

    @Test
    public void test1(){
        ThreadLocal threadLocal = new ThreadLocal(){
            @Override
            protected Object initialValue() {
                return super.initialValue();
            }
        };
        threadLocal.set("afsdf");

    }

    @Test
    public void test() throws Exception {
        //1
        Person1 p1 = new Person1();
        Class class1 = p1.getClass();
        System.out.println(class1);
        //2
        Class class2 = Person1.class;
        System.out.println(class2);
        //3
        String className = "com.day18.reflect.test.Person1";
        Class class3 = Class.forName(className);
        System.out.println(class3);
        //4
        Class class4 = this.getClass().getClassLoader().loadClass(className);
        System.out.println(class4);

        ClassLoader cl = this.getClass().getClassLoader();
        System.out.println(cl);
        System.out.println(cl.getParent());

        //资源在包下
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(is);
        String user = properties.getProperty("user");
        String pass = properties.getProperty("password");
        System.out.println("user:" + user + ",pass:" + pass);

    }

}

class Person1 {
    private String name;
    private int age;

    public Person1() {

    }
}
