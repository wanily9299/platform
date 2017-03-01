package com.zhouwei.platform.mapper;

import com.zhouwei.platform.bean.TestBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by zhouwei on 2017/3/1.
 */
@Mapper
public interface TestMapper{

//    @Select("select * from t_test")
    List<TestBean> findAll();
}
