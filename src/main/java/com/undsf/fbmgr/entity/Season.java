package com.undsf.fbmgr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 赛季
 * Created by Arathi on 2018/5/8.
 */
@Entity
public class Season {
    @Id
    @GeneratedValue
    public Integer id;

    @Column(name = "group_id")
    public int groupId;

    public String name;

    public int champion;  // 冠军球队
}
