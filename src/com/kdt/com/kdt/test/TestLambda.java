package com.kdt.com.kdt.test;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * Created by admin on 2019/1/18
 * AT 15:44
 **/
public class TestLambda {

    @Test
    public void test() {

        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        treeSet.add("3333");
        treeSet.add("1111");
        treeSet.add("2222");
        treeSet.add("0000");
        treeSet.add("0000");
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=================");
        //====================
        TreeSet<String> treeSet1 = new TreeSet<>(
                (o1, o2) -> o1.compareTo(o2)
        );
        treeSet1.add("3333");
        treeSet1.add("1111");
        treeSet1.add("2222");
        treeSet1.add("0000");
        treeSet1.add("0000");
        Iterator<String> it1 = treeSet1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println("================");
        Consumer<String> consumer = (args) -> System.out.println(args);
        consumer.accept("ddddd");
        System.out.println("================");
        Face1 face1 = () -> {
            System.out.println("11223243434");
            System.out.println(111111);
            return "aaaaa";
        };
        String ss = face1.sayHello();
        System.out.println(ss);
    }
}

@FunctionalInterface
interface Face1 {
    public String sayHello();
}