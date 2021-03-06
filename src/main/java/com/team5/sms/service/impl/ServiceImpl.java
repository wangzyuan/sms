/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: tangqihua[tang_qh@suixingpay.com]
 * @date: 2018年10月27日 18时14分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.team5.sms.service.impl;

import com.team5.sms.dao.Dao;
import com.team5.sms.entity.Student;
import com.team5.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dao")
public class ServiceImpl implements StudentService {
    @Autowired
    Dao dao;

    @Override
    public void add(Student student) {
        dao.add(student);
    }

    @Override
    public void update(Student student) {
        dao.update(student);
    }

    @Override
    public List<Student> findAllStudent() {
        List<Student> list = dao.findAllStudent();
        return list;

    }

    @Override
    public void deleteStudent(String sId) {
        dao.deleteStudent(sId);
    }

    @Override
    public List<Student> findStudentById(String sid) {
        List<Student> list = dao.findStudentById(sid);
        return list;
    }

    @Override
    public List<Student> findStudentByName(String name) {
        List<Student> list = dao.findStudentByName(name);
        return list;
    }

    @Override
    public List<Student> findStudentByNameAndById(String name, String sid) {
        List<Student> list = dao.findStudentBYIdAndByName(name,sid);
        return list;
    }
}