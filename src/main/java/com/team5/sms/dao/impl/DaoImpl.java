/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: tangqihua[tang_qh@suixingpay.com]
 * @date: 2018年10月27日 18时11分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.team5.sms.dao.impl;

import com.team5.sms.Util.FileUtil;
import com.team5.sms.cache.CacheList;
import com.team5.sms.dao.Dao;
import com.team5.sms.entity.Student;

import java.util.List;

public class DaoImpl implements Dao {
    @Override
    public void add(Student student) {

        List<Student> studentList = CacheList.getCacheList();
        studentList.add(student);
        System.out.println(studentList);
    }
}