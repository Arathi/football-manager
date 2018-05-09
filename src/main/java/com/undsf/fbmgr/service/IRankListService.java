package com.undsf.fbmgr.service;

import com.undsf.fbmgr.entity.PlayerRankListItem;
import com.undsf.fbmgr.entity.TeamRankListItem;

import java.util.List;

/**
 * Created by Arathi on 2018/5/9.
 */
public interface IRankListService {
    List<TeamRankListItem> getTeamRankList(int groupId, int seasonNo);
    List<PlayerRankListItem> getPlayerRankList(int groupId, int seasonNo);
}
