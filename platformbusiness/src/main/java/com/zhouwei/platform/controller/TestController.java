package com.zhouwei.platform.controller;

import com.github.pagehelper.PageHelper;
import com.zhouwei.platform.bean.TestBean;
import com.zhouwei.platform.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by zhouwei on 2017/3/1.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/test")
    public Map<String,String> test(){
        Map<String, String> map = new HashMap<>();
        map.put("name","zhouwei");
        map.put("mail","zhouwei@qq.com");
        return map;
    }

    @RequestMapping("/saveUser")
    public TestBean test(@RequestParam String name){
        TestBean tb = new TestBean();
        tb.setId(UUID.randomUUID().toString());
        tb.setName(name);
        TestBean testBean = testService.saveTest(tb);
        return testBean;
    }

    @RequestMapping("/findAll")
    public List<TestBean> findAll(){
        List<TestBean> all = testService.findAll();
        return all;
    }

    @RequestMapping("/findByPage")
    public List<TestBean> findByPage(@RequestParam int pageNum, @RequestParam int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<TestBean> all = testService.findAll();
        return all;
    }

}
