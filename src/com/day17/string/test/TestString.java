package com.day17.string.test;

import org.junit.Test;

import java.util.*;

/**
 * Created by admin on 2019/1/21
 * AT 11:13
 **/
public class TestString {

    @Test
    public void test1(){
        String s1 = "hello";
        String s2 ="java";
        String s3=  (s1 + s2).intern();
        String s4 = "hello" + "java";
        String s5 = "hellojava";
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
    }

    @Test
    public void test(){

        String s1 = "hello";
        String s2 = "world";
        String s3 = new String("hello");
        String s4 = "hello";
        String s5 = s1 + s2;
        String s6 = "hello"+"world";
        String s7 = "helloworld";
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s3));
        System.out.println(s5 == s6);
        System.out.println(s6 == s7);

        String s8 = "fasdfasdf中国";
        char[] b = s8.toCharArray();
        for(char b1  :b){
            System.out.println(b1);
        }
        System.out.println(new String(b));

        Map<String,String> map = new HashMap<>();
        map.put("111","dfaadf");
        map.put("232","adfdf");
        map.put("343","3423");

        List<String> list = new ArrayList<>();
        list.add("fasdf");
        list.add("fadfasfd");
        for(String s  :list){
            System.out.println(s);
        }

//        Set<Map.Entry<String,String>> entry = map.entrySet();
//        for(Map.Entry en : entry){
//            // Map.Entry a = (Map.Entry)en;
//            System.out.println(en.getKey() + ", "+ en.getValue());
//        }

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for(Map.Entry<String,String> entry2 : entrySet){
            entry2.getKey();
        }

        Iterator it = entrySet.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey()+ ","+entry.getValue());
        }

    }

}
