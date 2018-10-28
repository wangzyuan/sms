/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: yaonan
 * @date: 2018年10月27日 13时21分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.team5.sms.Util;

import com.team5.sms.entity.Student;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    //读文件
    public static List<Student> readFile(String name){
        List<Student> stuList = new ArrayList<Student>();

        BufferedReader br = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            br = new BufferedReader(new InputStreamReader( new FileInputStream(name)));
            String studentInfo = null;
            while((studentInfo = br.readLine()) != null) {//判断改行是否有数据
                Student student = new Student();
                System.out.printf(studentInfo);
                String[] stu = studentInfo.split(",");
                student.setName(stu[0]);
                student.setSex(Integer.valueOf(stu[1]));
                student.setAge(Integer.valueOf(stu[2]));
                student.setSclass(stu[3]);
                student.setTeacher(stu[4]);
                student.setCreate_time(stu[5]);
                student.setYear(stu[6]);
                student.setStatus(Integer.parseInt(stu[7]));
                student.setSid(stu[8]);
                stuList.add(student);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stuList;
    }

    //写文件
    public static void writeFile(List<Student> l,String name){
        PrintWriter pw = null;

        try {
            pw= new PrintWriter(
                    new OutputStreamWriter(
                    new FileOutputStream(name,false),"utf-8"),true);
            for(int i = 0; i < l.size(); i++){
                Student s = l.get(i);
                StringBuffer sb = new StringBuffer();
                sb.append(s.getName()).append(",").append(s.getSex()).append(",").append(s.getAge()).append(",")
                        .append(s.getSclass()).append(",").append(s.getTeacher()).append(",").append(s.getCreate_time())
                        .append(",").append(s.getYear()).append(",").append(s.getStatus()).append(",").append(s.getSid());
                pw.println(sb);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (UnsupportedEncodingException e1){
            e1.printStackTrace();
        }finally {
            if(pw != null){
                pw.close();//关闭流
            }
        }
    }
}