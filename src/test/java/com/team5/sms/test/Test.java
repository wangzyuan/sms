/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: guoqixin[guo_qx@suixingpay.com]
 * @date: 2018年10月27日 14时52分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.team5.sms.test;

import com.team5.sms.entity.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static Map<String, Student> readTxtFile(String filePath) {

        //存放内容的map对象
        Map<String, Student> filemaps = new HashMap<String, Student>();
        try {
            String encoding = "GBK";
            File file = new File(filePath);
            int count = 0;//定义顺序变量
            if (file.isFile() && file.exists()) { // 判断文件是否存在
                InputStreamReader read = null;// 考虑到编码格式
                try {
                    read = new InputStreamReader(
                            new FileInputStream(file), encoding);
                } catch (UnsupportedEncodingException e1) {
                    e1.printStackTrace();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    //按行读取
                    System.out.println("lineTxt=" + lineTxt);
                    if (!"".equals(lineTxt)) {
                        String[] infos = lineTxt.split(" ");
                        Student student = new Student();
                        student.setName(infos[1]);
                        student.setAge(Integer.valueOf(infos[2]));
                        student.setSex(Integer.valueOf(infos[3]));
                        student.setTeacher(infos[4]);
                        student.setYear(infos[5]);
                        student.setStatus(Integer.valueOf(infos[6]));
                        filemaps.put(infos[0], student);
                    }
                }
                read.close();//关闭InputStreamReader
                bufferedReader.close();//关闭BufferedReader
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return filemaps;
    }

    public static void main(String[] args) {
        String filename = "C:\\Users\\gqx\\Desktop\\test.txt";
        Map<String, Student> filemaps = readTxtFile(filename);
        System.out.println(filemaps.get("150521121").getName());
        System.out.println(filemaps.get("150521122").getName());
        System.out.println(filemaps.get("150521123").getName());
    }
}