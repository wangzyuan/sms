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
import com.team5.sms.dao.impl.DaoImpl;
import com.team5.sms.entity.Student;
import com.team5.sms.service.StudentService;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ServiceImpl implements StudentService {
    @Resource
    Dao dao ;
    @Override
    public void add(Student student) {
        dao.add(student);
    }
}