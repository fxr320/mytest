package com.kdt;

/**
 * Created by admin on 2018/12/26
 * AT 23:02
 **/
public class Man extends Person {

    public int id;

    public Man() {
        super("sss", 12);
        id = 10;
    }

    public void eat() {
        System.out.println("fadsfaf");
    }

    public void show() {
        System.out.println("name:" + this.getName() + ",age:" + this.getAge());
    }


}
