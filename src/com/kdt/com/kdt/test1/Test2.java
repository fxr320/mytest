package com.kdt.com.kdt.test1;

import org.junit.Test;

import javax.sql.rowset.Predicate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2019/1/13
 * AT 12:07
 **/
public class Test2 {

    @Test
    public void method1(){
        List list = Arrays.asList("bb","cc","aaa");
        String[] arr = new String[]{"aa","bbb","cc"};
        System.out.println(Arrays.binarySearch(arr,"aaa"));

    }

}
