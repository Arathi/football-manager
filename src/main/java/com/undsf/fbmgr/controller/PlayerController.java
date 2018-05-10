package com.undsf.fbmgr.controller;

import com.undsf.fbmgr.common.JsonConvert;
import com.undsf.fbmgr.entity.Player;
import com.undsf.fbmgr.message.BaseMessage;
import com.undsf.fbmgr.message.DataMessage;
import com.undsf.fbmgr.service.IPlayerService;
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
public class PlayerController extends BaseRestController<Player, Integer, IPlayerService> {
    @Override
    public Player DeserializeEntity(String json, Integer integer) {
        return JsonConvert.DeserializeObject(json, Player.class);
    }

    @Override
    public String getEntityName() {
        return "球员";
    }
}
