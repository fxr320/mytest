package com.day15.io.test;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by admin on 2019/1/13
 * AT 21:22
 **/
public class TestOtherSteram {

    @Test
    public void test1(){

        BufferedReader br = null;
        try {
            InputStream is = System.in;
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String str;
            while(true){
                System.out.println("请输入：");
                str = br.readLine();
                if(str.equals("e") || str.equals("exit"))
                    break;
                System.out.println(str.toUpperCase());
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(br!=null){
                try {
                    br.close();
                }catch(Exception e){
                    e.printStackTrace();
                }finally{
                    br = null;
                }
            }
        }

    }

}
