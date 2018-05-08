package com.undsf.fbmgr.common;

/**
 * Created by Arathi on 2018/5/8.
 */
public class Constants {
    public static final int GENDER_FEMALE = 0;
    public static final int GENDER_MALE = 1;

    public static final int EVENT_TYPE_NONE = 0;
    public static final int EVENT_TYPE_GOAL = 1;
    public static final int EVENT_TYPE_FOUL = 2;
    public static final int EVENT_TYPE_PAUSE = 3;

    public static final int PLAYER_STATUS_ACTIVE = 0;    // 正常
    public static final int PLAYER_STATUS_VACATION = 1;  // 休假
    public static final int PLAYER_STATUS_SUSPEND = 2;   // 禁赛
    public static final int PLAYER_STATUS_RETIRED = 3;   // 退役

    public static final int MATCH_STATUS_READY = 0;      // 未开始
    public static final int MATCH_STATUS_PLAYING = 1;    // 正在比赛
    public static final int MATCH_STATUS_SUSPEND = 2;    // 暂停
    public static final int MATCH_STATUS_END = 9;        // 已结束
}
