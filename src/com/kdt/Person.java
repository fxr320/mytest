package com.kdt;

/**
 * Created by admin on 2018/12/26
 * AT 23:02
 **/
public abstract class Person<T> {

    private String name;
    private int age;
    public int id;
    private T data;
    private static String nation = "中国";


    static {
        name1 = "fadsfasdf";
    }

    final static String name1;

    protected Person() {
    }

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = 12;
    }

    abstract void eat();

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
}
