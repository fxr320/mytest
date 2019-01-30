package com.day15.io.test;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by admin on 2019/1/16
 * AT 14:35
 **/
public class TestFileWriter {

    @Test
    public void test1() {
        BufferedReader reader = null;
        try {
            FileReader fr = new FileReader("test.txt");
            reader = new BufferedReader(fr);
            char[] c = new char[10];
            int len = 0;
            while ((len = reader.read(c)) != -1) {
                System.out.print(new String(c, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test() {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("test.txt");
            bw = new BufferedWriter(fw);
            String str = "中芬两国14日发表了未来4年联合工作计划，公布了一系列冬季运动合作措施，\n" +
                    "包括北京体育大学将设立中芬冬季运动学院；\n" +
                    "中国国家体育总局和芬兰教育和文化部围绕北京2022年冬奥会开展合作，\n" +
                    "并探讨在冬奥会后继续推动冬季运动发展合作的可能性。";
            bw.write(str);
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
