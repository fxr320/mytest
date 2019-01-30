package com.day17.string.test;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by admin on 2019/1/22
 * AT 17:11
 **/
public class Test1 {

    @Test
    public void test1(){
        String[] str = new String[]{"3","6","1","7","9","0","2","5","4","8"};
        Arrays.sort(str);
        for(String s : str){
            System.out.println(s);
        }
    }

    @Test
    public void test2(){
        int k = 0;
        int ret = ++k + k++ +  ++k +k;
        System.out.println(ret);
    }

    @Test
    public void test3(){
        int i1 = 10,i2=10;
        System.out.println(i1+i2);
        System.out.println(i1-i2);
        System.out.println(i1 * i2);
        System.out.println(i1/i2);

        System.out.println(jisuan(1));
    }

    private int jisuan(int n){
        //10!=1*2*3*4*5*6*7*8*9*10;
        if(n >= 10){
            return n;
        }else{
           return n*jisuan(n+1);
        }
    }


    @Test
    public void test() {
//        char c = '9';
//        System.out.println((int)c);
        String str = "abcd1efg23hi4j5678";
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (char c : chars) {
            if (c >= 48 && c <= 57) {
                continue;
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

    @Test
    public void test5(){
        BigInteger bi = new BigInteger("12433241123");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi.compareTo(new BigInteger("34234324")));
        System.out.println(bi);
        // System.out.println(bd.divide(bd2));
        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 15, BigDecimal.ROUND_HALF_UP));
    }

}
