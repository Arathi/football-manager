package com.undsf.fbmgr.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 比赛
 * Created by Arathi on 2018/5/8.
 */
@Entity(name = "matches")
public class Match {
    @Id
    @GeneratedValue
    public Integer id;

    @Column(name = "season_id")
    @JsonProperty(value = "season_id")
    public int seasonId;

    public String name;

    public int team1;

    public int team2;

    public int status;

    public int score1;

    public int score2;

    /**
     * 裁判员
     */
    public String referee1;

    /**
     * 辅助裁判员
     */
    public String referee2;

    /**
     * 比赛场地
     */
    public String ground;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    @JsonProperty(value = "start_time")
    public String startTime;
}
