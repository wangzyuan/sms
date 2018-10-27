package com.team5.sms.controller;

import com.team5.sms.entity.Student;
import com.team5.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: wangzhiyuan[wang_zy1@suixingpay.com]
 * @date: 2018年10月26日 17时49分
 * @Copyright 2018 ©Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
@Controller
public class StudentController {

    @Resource
    StudentService studentService;

    @RequestMapping("/index")
    public  String index(){
        return "index";
    }

    @RequestMapping("/add")
    public void addStudent(Student student){
        studentService.add(student);
    }
}
