package com.team5.sms.controller;

import com.team5.sms.Util.FileUtil;
import com.team5.sms.cache.CacheList;
import com.team5.sms.entity.Student;
import com.team5.sms.service.StudentService;
import org.springframework.stereotype.Controller;
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
public class StudentController{
    private List<Student> list;
    StudentService studentService;
    @RequestMapping("/index")
    public  String index(){
        return "index";
    }

    /**
     * 姚楠
     * @param student
     */
    @RequestMapping("/add")
    public void add(Student student){
        studentService.add(student);
    }

    @RequestMapping("/update")
    public String updateStudent(HttpServletRequest req, Student student){
      list= CacheList.getCacheList();
        for (int i=0; i < list.size(); i++){
            if (student.getSid().equals(list.get(i).getSid())){
                list.get(i).setName(student.getName());
                list.get(i).setAge(student.getAge());
                list.get(i).setSex(student.getSex());
                list.get(i).setSclass(student.getSclass());
                list.get(i).setTeacher(student.getTeacher());
                list.get(i).setYear(student.getYear());
                list.get(i).setStatus(student.getStatus());
            }
        }
        FileUtil.writeFile(list,"b.txt");
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
    public String findAllStudent(HttpServletRequest req,Student student){
        list = CacheList.getCacheList();
        req.setAttribute("list",list);
        return "index";
    }
}
