package com.undsf.fbmgr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 比赛
 * Created by Arathi on 2018/5/8.
 */
@Entity
public class Match {
    @Id
    public int id;

    @Column(name = "season_id")
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
    public String startTime;
}
