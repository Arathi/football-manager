package com.undsf.fbmgr.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 球员
 * Created by Arathi on 2018/5/8.
 */
@Entity
public class Player {
    @Id
    @GeneratedValue
    public Integer id;

    public String name;

    public int gender;

    @Column(name = "team_id")
    @JsonProperty(value = "team_id")
    public int teamId;

    public int number;

    public int status;

    // public String birthday;
    // public double height;
    // public double weight;
}
