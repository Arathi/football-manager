package com.undsf.fbmgr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 分组
 * Created by Arathi on 2018/5/8.
 */
@Entity(name = "groups")
public class Group {
    @Id
    @GeneratedValue
    public Integer id;

    public String name;

    public String description;
}
