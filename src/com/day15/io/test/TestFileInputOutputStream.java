package com.day15.io.test;

import org.junit.Test;

import java.io.*;

/**
 * Created by admin on 2019/1/13
 * AT 21:35
 **/
public class TestFileInputOutputStream {

    @Test
    public void test5() {
        InputStream is = System.in;
        /*TODO today 待办事项*/}

    @Test
    public void test4() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {

            File file1 = new File("Java英语.txt");
            File file2 = new File("Java英语1.txt");

            FileReader fr = new FileReader(file1);
            FileWriter fw = new FileWriter(file2);

            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

//            char[] c = new char[1024];
//            int len = 0;
//
//            while ((len = br.read(c)) != -1) {
//
//                bw.write(c, 0, len);
//                bw.flush();
//
//            }
            String str = "";
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {

                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


    }

    @Test
    public void test3() {

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File file1 = new File("C:\\Users\\admin\\Desktop\\[www.java1234.com]4天贯通JDBC_尚硅谷_宋红康.pdf");
            File file2 = new File("C:\\Users\\admin\\Desktop\\[www.java1234.com]4天贯通JDBC_尚硅谷_宋红康1.pdf");
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] b = new byte[1024];
            int len;
            while ((len = bis.read(b)) != -1) {
                bos.write(b, 0, len);
                bos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                bis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() {
        FileOutputStream fos = null;
        try {
            File file = new File("hello1.txt");
            fos = new FileOutputStream(file);
            fos.write(new String("i love china22").getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test1() {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);
            //int len = fis.read();
            byte[] b = new byte[10];
            int len = 0;
            while ((len = fis.read(b)) != -1) {
                String str = new String(b, 0, len);
                System.out.print(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
