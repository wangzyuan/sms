/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: guoqixin[guo_qx@suixingpay.com]
 * @date: 2018年10月27日 17时23分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.team5.sms.cache;

import com.team5.sms.Util.FileUtil;
import com.team5.sms.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.List;

@Component
public class DestroyCache {

    @Autowired
    private DataSource dataSource;

    /**
     * 容器结束时执行方法，将ArrayList中的学生信息存到txt文件中
     */
    @PreDestroy
    public void destroy() {

        System.out.println("<<<<<<<<<<<我被销毁了......................>>>>>>>>>>>>>>>");
        List<Student> students = CacheList.getCacheList();
        String filePath = dataSource.getFileRoot();
        System.out.println("--{}---"+filePath);
        FileUtil.writeFile(students,filePath);
    }
}