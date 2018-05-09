package com.undsf.fbmgr.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 场地
 * Created by Arathi on 2018/5/8.
 */
@Entity
public class Ground {
    @Id
    @GeneratedValue
    public Integer id;

    public String address;

    public double longitude;

    public double latitude;
}
