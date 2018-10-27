package com.team5.sms.cache;

import com.team5.sms.Util.FileUtil;
import com.team5.sms.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: guoqixin[guo_qx@suixingpay.com]
 * @date: 2018年10月26日 21时34分
 * @Copyright 2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
public class CacheList {

    private static List<Student> cacheList;

    @Autowired
    private static DataSource dataSource;

    static {
        //String fileRoot = dataSource.getFileRoot();
        String fileRoot = "b.txt";
        cacheList = FileUtil.readFile(fileRoot);
    }

    public static List<Student> getCacheList() {
        return cacheList;
    }
}