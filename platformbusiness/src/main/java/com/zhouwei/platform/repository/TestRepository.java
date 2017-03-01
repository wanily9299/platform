package com.zhouwei.platform.repository;

import com.zhouwei.platform.bean.TestBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhouwei on 2017/3/1.
 */
public interface TestRepository extends JpaRepository<TestBean, String>{
}
