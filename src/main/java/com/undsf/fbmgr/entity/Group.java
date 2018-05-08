package com.undsf.fbmgr.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 分组
 * Created by Arathi on 2018/5/8.
 */
@Entity
public class Group {
    @Id
    public int id;

    public String name;

    public String description;
}
