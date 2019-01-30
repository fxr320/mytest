package com.kdt;

import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2018/12/27
 * AT 11:17
 **/
public class Java8Tester {

    public static void main(String[] args) {

//        List<String> list = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//
//        long count = list.stream().filter(n -> n.isEmpty()).count();
//        System.out.println(count);
//
//        list.stream().filter(n->!n.isEmpty()).forEach(System.out::println);
//        System.out.println("");
//
//        int num = (int)list.stream().filter(n->n.length() > 2).count();
//        System.out.println(num);

        myclass my = new myclass();
        my.print();

        Hello h = new Hello();
        Hello.myclass1 c = h.new myclass1();

    }

    private static class myclass {
        private int a;
        private int b;

        public myclass() {
            this.a = 1;
            this.b = 2;
        }

        public void print() {
            System.out.println("a:" + this.a + ",b:" + this.b);
        }
    }

}
