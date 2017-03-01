package com.zhouwei.platform.service.impl;

import com.zhouwei.platform.bean.TestBean;
import com.zhouwei.platform.mapper.TestMapper;
import com.zhouwei.platform.repository.TestRepository;
import com.zhouwei.platform.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhouwei on 2017/3/1.
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestRepository testRepository;

    @Autowired
    TestMapper testMapper;

    @Override
    public TestBean saveTest(TestBean testBean) {
        TestBean saved = testRepository.save(testBean);
        return saved;
    }

    @Override
    public List<TestBean> findAll() {
        return testMapper.findAll();
    }
}
