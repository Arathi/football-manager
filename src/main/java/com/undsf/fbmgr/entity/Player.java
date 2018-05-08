package com.undsf.fbmgr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 球员
 * Created by Arathi on 2018/5/8.
 */
@Entity
public class Player {
    @Id
    public int id;

    public String name;

    public int gender;

    @Column(name = "team_id")
    public int teamId;

    public int number;

    public int status;

    // public String birthday;
    // public double height;
    // public double weight;
}
