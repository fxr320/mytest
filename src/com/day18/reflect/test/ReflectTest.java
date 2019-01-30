package com.day18.reflect.test;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by admin on 2019/1/22
 * AT 8:44
 **/
public class ReflectTest {

    @Test
    public void test() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;
        Person p = clazz.newInstance();
        System.out.println(p);
        Field field = clazz.getField("name");
        field.set(p, "afdasfd");
        System.out.println(p);
        Field field1 = clazz.getDeclaredField("age");
        field1.setAccessible(true);
        field1.set(p, 11);
        System.out.println(p);
        Method method=  clazz.getMethod("eat");
        method.invoke(p);
    }


}

class Person {

    public String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
