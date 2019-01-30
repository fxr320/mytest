package com.kdt;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;

/**
 * Created by admin on 2018/12/26
 * AT 23:00
 **/
public class Hello {

    public static void main(String[] args) throws Exception {

        String city = "";
        System.out.println(city.length() >= 2 ? city.substring(0, 2) : city);
//        Collection coll = new ArrayList();
//        coll.add();
//        coll.addAll(new ArrayList());
//        coll.contains();
//        coll.remove();
//        coll.retainAll();
//        coll.clear();
//        List l = new ArrayList();
//        Iterator it = l.iterator();
//        wihle(it.hasNext()){
//            System.out.println(it.next());
//            throw new Exception("fdsasdf");
//        }


//        String s = "我喜欢，￥。。。..&@,Java";
//        char[] chars = s.toCharArray();
//        for(int i = 0; i < chars.length; i ++) {
//            if((chars[i] >= 19968 && chars[i] <= 40869) || (chars[i] >= 97 && chars[i] <= 122) || (chars[i] >= 65 && chars[i] <= 90)) {
//                System.out.print(chars[i]);
//            }
//        }
//
//        Integer i = Integer.valueOf(1);
//        i+=1;
//        System.out.println(i);

//            Integer i = 1;
//            Integer i1 = 1;
//        System.out.println(i == i1);

        // Person p = new Man();
        // System.out.println(p.id);
        // System.out.println(Person.nation);


        // char c = (char) 40869;
        // System.out.println(c);

//        List<String> list = new ArrayList<>();
//        list.add("afdafd");
//        list.add("efe");
//
//        //list.forEach(n-> System.out.println(n));
//        list.forEach(System.out::println);
//
//        Person p = new Man();
//        if(p instanceof Man) {
//            Man p1 = (Man)p;
//            p1.show();
//        }
//
//        show1(new Man());

        // Map m = new HashMap<>();


//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//
//        //evaluate(list,n->true);
//
//        //evaluate(list,n->false);
//
//        //evaluate(list,n->n%2==0);
//
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//        // 获取空字符串的数量
//        long count = strings.stream().filter(string -> string.isEmpty()).count();
//        System.out.println(count);
//
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//
//        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
//
//        System.out.println("列表中最大的数 : " + stats.getMax());
//        System.out.println("列表中最小的数 : " + stats.getMin());
//        System.out.println("所有数之和 : " + stats.getSum());
//        System.out.println("平均数 : " + stats.getAverage());

        try {
            method1();
        } catch (Exception e) {

        }


    }

    public static void method1() throws Exception {
        try {
            System.out.println("2222222");
            throw new Exception("333333");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("44444444");
        }

        System.out.println("fadfasdf");
    }

    public static void show1(Person p) {
        System.out.println(p.getName() + "," + p.getAge());
        if (p instanceof Man) {
            Man p1 = new Man();
            p1.show();
        }
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    public class myclass1 {

        @Test
        public void test1() throws Exception {
            int i = 10 / 0;

            System.out.println("fasdfsadf");
        }


    }

}
