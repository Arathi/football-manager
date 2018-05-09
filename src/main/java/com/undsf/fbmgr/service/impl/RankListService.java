package com.undsf.fbmgr.service.impl;

import com.undsf.fbmgr.entity.PlayerRankListItem;
import com.undsf.fbmgr.entity.TeamRankListItem;
import com.undsf.fbmgr.service.IRankListService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arathi on 2018/5/8.
 */
@Service
public class RankListService implements IRankListService {
    public List<TeamRankListItem> getTeamRankList(int groupId, int seasonNo) {
        return new ArrayList<>();
    }

    public List<PlayerRankListItem> getPlayerRankList(int groupId, int seasonNo) {
        return new ArrayList<>();
    }
}
