package com.team5.sms;

import com.team5.sms.Util.FileUtil;
import com.team5.sms.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmsApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
//        List<Student> stu =  FileUtil.readFile("b.txt");
//        System.out.printf(stu.toString());
//        Student st = new Student();
//        st.setName("nihao");
//        System.out.printf(st.toString());

        List<Student> s = FileUtil.readFile("b.txt");
        System.out.println(s);
    }

}
