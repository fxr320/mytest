package com.day15.io.test;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Created by admin on 2019/1/30
 * AT 10:19
 **/
public class TestFpd {
    @Test
    public void test() {
        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream(new File("Java 8实战.pdf"));
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            br = new BufferedReader(isr);
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
