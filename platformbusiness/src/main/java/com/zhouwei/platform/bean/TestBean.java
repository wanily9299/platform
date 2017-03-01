package com.zhouwei.platform.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zhouwei on 2017/3/1.
 */
@Data
@Entity
@Table(name="t_test")
public class TestBean {
    @Id
    private String id;

    @Column
    private String name;
}
