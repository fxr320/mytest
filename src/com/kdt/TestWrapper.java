package com.kdt;

import org.junit.Test;

import java.util.Vector;

/**
 * Created by admin on 2018/12/28
 * AT 21:32
 **/
public class TestWrapper {

    @Test
    public void test1() {

        int i = 10;
        boolean b = false;
        Integer i1 = new Integer(i);
        System.out.println(i1.toString());
        Float f = new Float(12.3f);
        System.out.println(f);
        Boolean b1 = new Boolean(b);
        System.out.println(b1);

        int i2 = i1.intValue();

        Integer i4 = 10;
        int i5 = 20;
        System.out.println(i5 - i4);

        String.valueOf(i2);


        Vector v = new Vector();
        v.addElement(new Integer(10));
        v.addElement(new Float(10.2));
        v.add(new Order());

        v.forEach(n -> System.out.println(n));
    }

}

class Order{
    Integer i ;
}
