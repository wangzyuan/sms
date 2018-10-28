package com.team5.sms.controller;

import com.team5.sms.entity.Student;
import com.team5.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


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
    private List<Student> list;
    @Autowired
    StudentService studentService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/addRedirect")
    public String addRedirect() {
        return "add";
    }
    /**
     * 姚楠
     *
     * @param student
     */
    @RequestMapping("/add")
    public String add(Student student) {
        studentService.add(student);
        return "redirect:/find";
    }

    /*
     * All rights Reserved, Designed By Suixingpay.
     *
     * @Author wangzhiyuan[wang_zy1@suixingpay.com]
     * @Method update
     * @Date 2018/10/28   10:31
     * @Copyright © 2018 Suixingpay. All rights reserved.
     * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
     */
    @RequestMapping("/update")
    public String updateStudent(HttpServletRequest req, Student student) {
        studentService.update(student);
        return "index";

    }

    /*
     * All rights Reserved, Designed By Suixingpay.
     *
     * @Author gonghang[gong_hang@suixingpay.com]
     * @Method findAll
     * @Date 2018/10/28   10:38 AM
     * @Copyright ©2018 Suixingpay. All rights reserved.
     * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
     */
    @RequestMapping("/find")
    public String findAllStudent(HttpServletRequest req){
        List<Student> list  =studentService.findAllStudent();
        req.setAttribute("list",list);
        return "index";
    }
   @RequestMapping("/updateUI")
    public String updateUI(){

        return "update";
   }

   @RequestMapping("/findById")
    public String findStudentById(HttpServletRequest req,Student student){
        List<Student> list = studentService.findStudentById(student);
            req.setAttribute("list",list);
            return "index";
       }

    /**
     * 根据学号进行删除
     * @Author guo_qx
     * @param sid
     * @return
     */
    @RequestMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable String sid) {
        studentService.deleteStudent(sid);
        return "redirect:/find";
    }
}



