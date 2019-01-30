package com.day14.collection.test;

import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by admin on 2019/1/13
 * AT 22:50
 **/
public class CollectionTest {

    @Test
    public void test1() {
        String[] arrs = new String[]{"111", "234", "dfsfdaf"};
        List<String> list = Arrays.asList(arrs);

        List<String> list1 = null;
//        System.out.println(list.size());
//        List list1 = Arrays.asList(1,"adf",new Date());
//        System.out.println(list1.size());

        Collections.shuffle(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    public void test() {

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("223344");
        boolean b = m.matches();
        System.out.println(b);

        Runnable r = () -> System.out.println("fadsf");
        r.run();
    }

    @Test
    public void test3() {
        int k = 1;
        int ret = (++k) + (k++) + (++k) + k;
        System.out.println(ret);
    }
}
