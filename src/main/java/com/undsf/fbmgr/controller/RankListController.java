package com.undsf.fbmgr.controller;

import com.undsf.fbmgr.entity.PlayerRankListItem;
import com.undsf.fbmgr.entity.TeamRankListItem;
import com.undsf.fbmgr.message.DataMessage;
import com.undsf.fbmgr.service.IRankListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by Arathi on 2018/5/8.
 */
@RestController
@RequestMapping(value = "/ranklist")
public class RankListController {
    @Autowired
    private IRankListService rankListSvc;

    @RequestMapping(value = "/team", method = RequestMethod.GET)
    public @ResponseBody DataMessage<List<TeamRankListItem>> getTeamRankList(
            @RequestParam("group") Optional<Integer> group,
            @RequestParam("season") Optional<Integer> season
    ) {
        int groupId = 0;
        if (group.isPresent()) {
            groupId = group.get();
        }
        else {
            return new DataMessage<>(1, "组别不能为空", null);
        }

        int seasonNo = 0;
        if (season.isPresent()) {
            seasonNo = season.get();
        }
        else {
            return new DataMessage<>(2, "赛季不能为空", null);
        }

        DataMessage<List<TeamRankListItem>> respMsg = new DataMessage<>();
        List<TeamRankListItem> rankList = rankListSvc.getTeamRankList(groupId, seasonNo);
        respMsg.data = rankList;
        return respMsg;
    }

    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public @ResponseBody DataMessage<List<PlayerRankListItem>> getPlayerRankList(
            @RequestParam("group") Optional<Integer> group,
            @RequestParam("season") Optional<Integer> season
    ) {
        int groupId = 0;
        if (group.isPresent()) {
            groupId = group.get();
        }
        else {
            return new DataMessage<>(1, "组别不能为空", null);
        }

        int seasonNo = 0;
        if (season.isPresent()) {
            seasonNo = season.get();
        }
        else {
            return new DataMessage<>(2, "赛季不能为空", null);
        }

        DataMessage<List<PlayerRankListItem>> respMsg = new DataMessage<>();
        List<PlayerRankListItem> rankList = rankListSvc.getPlayerRankList(groupId, seasonNo);
        respMsg.data = rankList;
        return respMsg;
    }
}
