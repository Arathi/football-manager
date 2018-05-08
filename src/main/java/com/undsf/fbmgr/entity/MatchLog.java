package com.undsf.fbmgr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 比赛日志
 * Created by Arathi on 2018/5/8.
 */
@Entity(name = "match_log")
public class MatchLog {
    @Id
    public int id;

    @Column(name = "match_id")
    public int matchId;

    @Column(name = "event_type")
    public int eventType;

    @Column(name = "player_id")
    public int playerId;

    public String description;  // 描述
}
