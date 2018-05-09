package com.undsf.fbmgr.controller;

import com.undsf.fbmgr.common.JsonConvert;
import com.undsf.fbmgr.entity.Player;
import com.undsf.fbmgr.message.BaseMessage;
import com.undsf.fbmgr.message.DataMessage;
import com.undsf.fbmgr.service.impl.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Arathi on 2018/5/9.
 */
@Controller
@RequestMapping(value = "/player")
public class PlayerController {
    @Autowired
    private PlayerService playerSvc;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody DataMessage<List<Player>> getAllPlayer() {
        List<Player> players = playerSvc.getAll();
        DataMessage<List<Player>> respMsg = new DataMessage<>();
        if (players != null) {
            respMsg.data = players;
        }
        else {
            respMsg.code = 1;
            respMsg.message = "获取球员列表失败";
        }
        return respMsg;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody DataMessage<Player> getPlayerById(@PathVariable("id") int id) {
        Player p = playerSvc.getById(id);
        DataMessage<Player> respMsg = new DataMessage<>();
        if (p != null) {
            respMsg.data = p;
        }
        else {
            respMsg.code = 1;
            respMsg.message = "球员不存在";
        }
        return respMsg;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public @ResponseBody BaseMessage createPlayer(@RequestBody String json) {
        Player data = JsonConvert.DeserializeObject(json, Player.class);
        data.id = null;
        Player result = playerSvc.create(data);
        BaseMessage respMsg = new BaseMessage();
        if (result == null) {
            respMsg.code = 1;
            respMsg.message = "创建球员信息发生异常！";
        }
        return respMsg;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public @ResponseBody BaseMessage alterPlayer(@RequestBody String json) {
        Player data = JsonConvert.DeserializeObject(json, Player.class);
        Player result = playerSvc.save(data);
        BaseMessage respMsg = new BaseMessage();
        if (result == null) {
            respMsg.code = 1;
            respMsg.message = "更新球员信息发生异常！";
        }
        return respMsg;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody BaseMessage removePlayer(@PathVariable("id") int id) {
        boolean success = playerSvc.remove(id);
        BaseMessage respMsg = new BaseMessage(
                success ? 0 : 1,
                success ? "成功" : "删除球员失败！"
        );
        return respMsg;
    }
}
