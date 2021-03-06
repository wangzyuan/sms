package com.team5.sms.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.team5.sms.entity.Student;
import com.team5.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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

    /**
     * 姚楠
     *
     * @param student
     */
//    @RequestMapping("/add")
//    public void add(Student student) {
//        studentService.add(student);
//    }

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
//        System.out.println(student.toString());
        studentService.update(student);
        return "redirect:/find";

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
    public String findAllStudent(HttpServletRequest req) {
        List<Student> list = studentService.findAllStudent();
        req.setAttribute("list", list);
        return "index";
    }

    /*
     * All rights Reserved, Designed By Suixingpay.
     *
     * @Author wangzhiyuan[wang_zy1@suixingpay.com]
     * @Method 修改页面
     * @Date 2018/10/28   17:32
     * @Copyright © 2018 Suixingpay. All rights reserved.
     * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
     */
    @RequestMapping("/updateUI/{sid}")
    public String updateUI(HttpServletRequest req, @PathVariable String sid) {
        List<Student> list = studentService.findStudentById(sid);
        req.setAttribute("list", list);
        return "update";
    }

    /*
     * All rights Reserved, Designed By Suixingpay.
     *
     * @Author gonghang[gong_hang@suixingpay.com]
     * @Method findStudentById
     * @Date 2018/10/28   5:32 PM
     * @Copyright ©2018 Suixingpay. All rights reserved.
     * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
     */
    @RequestMapping("/findById/{sid}")
    public String findStudentById(HttpServletRequest req, @PathVariable String sid) {
        List<Student> list = studentService.findStudentById(sid);
        req.setAttribute("list", list);
        return "details";
    }

    @RequestMapping("/addRedirect")
    public String addRedirect() {
        return "add";
    }

    @RequestMapping("/add")
    public String add(Student student, BindingResult bindingResult) {
        System.out.println("---add---");
        System.out.println(student.toString() + "---");
        studentService.add(student);
        return "redirect:/find";
    }

    /**
     * 根据学号进行删除
     *
     * @param sid
     * @return
     * @Author guo_qx
     */
    @RequestMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable String sid) {

        studentService.deleteStudent(sid);
        return "redirect:/find";
    }
    @RequestMapping("/findStudent")
    public String findStudent(HttpServletRequest req, String name, String sid) {
        List<Student> list = studentService.findStudentById(sid);
        System.out.println(name);
        System.out.println(sid);
        if (name != null && (sid == null||sid=="")) {
            list = studentService.findStudentByName(name);
        } else if ((name == null||name=="") && sid != null) {
            list = studentService.findStudentById(sid);
        }else  if (name!=""&&sid!=""){
            list = studentService.findStudentByNameAndById(name,sid);
        }
            req.setAttribute("list",list);

        return "index";
    }
}



