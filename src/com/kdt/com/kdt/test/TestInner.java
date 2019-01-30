package com.kdt.com.kdt.test;

import org.junit.Test;

/**
 * Created by admin on 2019/1/7
 * AT 21:42
 **/
public class TestInner {

    @Test
    public void test(){
        int x = 10;
        int y = 20;
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(~x);
        System.out.println(x^y);
    }



    public static void main(String[] args) {
        TestInner ti = new TestInner();
        //BB b = new BB();
       // ti.show(b);

        AA a = new AA(){
            @Override
            public void save() {
                System.out.println("asdfasdfaewrwerw");
            }
        };

        ti.show(a);

//        ti.show(new AA(){
//            public void save(){
//                System.out.println("1223432424");
//            }
//        });
    }

    public void show(AA a){
        a.save();
    }

}

interface AA {
    void save();
}

class BB implements AA{
    public void save(){
        System.out.println("fasdfasfd");
    }
}
