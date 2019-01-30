package com.kdt.com.kdt.test;

import org.junit.Test;

/**
 * Created by admin on 2019/1/25
 * AT 12:57
 **/
public class TestRegular {
    @Test
    public void test() {
        String s = "23434";
        if (s.matches("\\d+")) {
            System.out.println("111");
        } else {
            System.out.println("3333");
        }

        String s1 = "fxr123";
        //[]{1,3};
        //[^]
        String s2 = "tel:0861-0666-88810009999";
        String s3 = "123456-2  ";
        String s4 = "7632417165";
        String s5 = "windows3.1";
        // System.out.println(s1.matches("f+"));
        // System.out.println(s2.matches("^tel:[0-9]{1,}-[0][0-9]{2,3}-[0-9]{8,11}"));
        // System.out.println(s3.matches("^\\d{2}[-\\d]+\\s+$"));
        System.out.println(s4.matches("^7(?![8])[0-9]{9}$"));
        System.out.println(s5.matches("^windows(?!95|nt|2000|xp)$"));


        Object o = new Object();
        Class c = o.getClass();
        System.out.println(c);
    }
}
