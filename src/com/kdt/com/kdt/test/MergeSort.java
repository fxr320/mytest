package com.kdt.com.kdt.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by admin on 2019/1/29
 * AT 16:49
 **/
public class MergeSort {

    @Test
    public void test(){

        int[] arrint = new int[]{1,6,2,543,344,45,23};
        int[] des = new int[arrint.length];
//        int[] arr = Arrays.copyOf(arrint,arrint.length);
//        System.out.println(arr.length);
//        int middle = (int)(Math.floor(arr.length / 2));
//        int[] arr1 = Arrays.copyOfRange(arr,0,middle);
//        System.out.println(arr1.length);
//        int[] arr2 = Arrays.copyOfRange(arr,middle,arr.length);
//        System.out.println(arr2.length);

        System.arraycopy(arrint,0,des,0,arrint.length);
        System.out.println(des.length);

    }


}
