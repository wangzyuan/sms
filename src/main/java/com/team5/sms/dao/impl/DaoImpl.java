/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: tangqihua[tang_qh@suixingpay.com]
 * @date: 2018年10月27日 18时11分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.team5.sms.dao.impl;

import com.team5.sms.cache.CacheList;
import com.team5.sms.dao.Dao;
import com.team5.sms.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DaoImpl implements Dao {
    @Override
    public void add(Student student) {
        List<Student> studentList = CacheList.getCacheList();
        studentList.add(student);
    }

    @Override
    public void update(Student student) {
        List<Student> list = CacheList.getCacheList();
        for (int i = 0; i < list.size(); i++) {
            if (student.getSid().equals(list.get(i).getSid())) {
                list.get(i).setName(student.getName());
                list.get(i).setAge(student.getAge());
                list.get(i).setSex(student.getSex());
                list.get(i).setSclass(student.getSclass());
                list.get(i).setTeacher(student.getTeacher());
                list.get(i).setYear(student.getYear());
                list.get(i).setStatus(student.getStatus());
            }
        }
    }


    public List<Student> findAllStudent() {
        List<Student> stuList = CacheList.getCacheList();
        List<Student> students = new ArrayList<>();
        for(int i=0;i<stuList.size();i++){
            if(stuList.get(i).getStatus()==1){
                students.add(stuList.get(i));
            }
        }
        return students;
    }

    @Override
    public List<Student> findStudentById(String sid) {
        List<Student> stuList = CacheList.getCacheList();
        List<Student> findList = new ArrayList<>();
        for(int i=0;i<stuList.size();i++){
            if(stuList.get(i).getSid().equals(sid)){
                findList.add(stuList.get(i));
            }
        }
        return findList;
    }

    @Override
    public List<Student> findStudentByName(String name) {
        List<Student> list  = CacheList.getCacheList();
        List<Student> findList = new ArrayList<Student>();
        for (int i = 0;i<list.size();i++){
            if (name.equals(list.get(i).getName())){
                findList.add(list.get(i));
            }
        }
        return findList;
    }

    @Override
    public List<Student> findStudentBYIdAndByName(String name, String sid) {
        List<Student> list  = CacheList.getCacheList();
        List<Student> findList = new ArrayList<Student>();
        for (int i = 0;i<list.size();i++){
            if ((name.equals(list.get(i).getName()))&&(sid.equals(list.get(i).getSid()))){
                findList.add(list.get(i));
            }
        }
        return findList;
    }

    @Override
    public void deleteStudent(String sid) {
        List<Student> list = CacheList.getCacheList();
        for (int i = 0; i < list.size(); i++) {
            if (sid.equals(list.get(i).getSid())) {
                list.get(i).setStatus(0);
            }
        }

    }


}