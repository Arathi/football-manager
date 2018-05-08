package com.undsf.fbmgr.controller;

import com.undsf.fbmgr.message.PlayerRankListItem;
import com.undsf.fbmgr.message.TeamRankListItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Arathi on 2018/5/8.
 */
@RestController
@RequestMapping("/ranklist")
public class RankListController {
    @RequestMapping("/team")
    public List<TeamRankListItem> getTeamRankList() {
        List<TeamRankListItem> rankList = null;
        return rankList;
    }

    @RequestMapping("/player")
    public List<PlayerRankListItem> getPlayerRankList() {
        List<PlayerRankListItem> rankList = null;
        return rankList;
    }
}
