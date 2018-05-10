package com.undsf.fbmgr.controller;

import com.undsf.fbmgr.common.JsonConvert;
import com.undsf.fbmgr.entity.Team;
import com.undsf.fbmgr.service.ITeamService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Arathi on 2018/5/10.
 */
@RestController
@RequestMapping(value = "/team")
public class TeamController extends BaseRestController<Team, Integer, ITeamService> {
    @Override
    public Team DeserializeEntity(String json, Integer integer) {
        return JsonConvert.DeserializeObject(json, Team.class);
    }

    @Override
    public String getEntityName() {
        return "球队";
    }
}
