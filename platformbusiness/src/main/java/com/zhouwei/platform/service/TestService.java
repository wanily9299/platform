package com.zhouwei.platform.service;

import com.zhouwei.platform.bean.TestBean;

import java.util.List;

/**
 * Created by zhouwei on 2017/3/1.
 */
public interface TestService {
    TestBean saveTest(TestBean testBean);

    List<TestBean> findAll();
}
