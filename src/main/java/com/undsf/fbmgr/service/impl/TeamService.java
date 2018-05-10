package com.undsf.fbmgr.service.impl;

import com.undsf.fbmgr.entity.Team;
import com.undsf.fbmgr.repository.ITeamRepository;
import com.undsf.fbmgr.service.ITeamService;
import org.springframework.stereotype.Service;

/**
 * Created by Arathi on 2018/5/10.
 */
@Service
public class TeamService extends BaseService<Team, Integer, ITeamRepository>
    implements ITeamService {
}
