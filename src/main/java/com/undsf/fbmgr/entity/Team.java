package com.undsf.fbmgr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 球队
 * Created by Arathi on 2018/5/8.
 */
@Entity
public class Team {
    @Id
    public int id;

    public String name;

    @Column(name = "group_id")
    public int groupId;

    public String description;
}
