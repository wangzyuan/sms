package com.team5.sms;

import com.team5.sms.Util.FileUtil;
import com.team5.sms.dao.impl.DaoImpl;
import com.team5.sms.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmsApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        DaoImpl di = new DaoImpl();
        Student student = new Student();
        student.setName("胡一统");
        student.setSex(1);
        student.setAge(10);
        student.setSclass("星火三期");
        student.setTeacher("老师");
        student.setCreate_time("2018-10-27");
        student.setYear("2018");
        student.setStatus(1);
        student.setSid("04");
        di.add(student);
    }

}
