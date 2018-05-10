package com.undsf.fbmgr.repository;

import com.undsf.fbmgr.entity.PlayerRankListItem;
import com.undsf.fbmgr.entity.TeamRankListItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Arathi on 2018/5/9.
 */
@org.springframework.stereotype.Repository
public interface IRankListRepository extends Repository {

    @Query(value = "select * from v_team_ranklist vtr where vtr.group_id=:group_id and vtr.season_no=:season_no order by vtr.point desc", nativeQuery = true)
    List<TeamRankListItem> getTeamRankList(@Param("group_id") int groupId,
                                           @Param("season_no") int seasonNo);

    @Query(value = "select * from v_player_ranklist vpr where vpr.group_id=:group_id and vtr.season_no=:season_no order by vpr.goals desc", nativeQuery = true)
    List<PlayerRankListItem> getPlayerRankList(@Param("group_id") int groupId,
                                               @Param("season_no") int seasonNo);
}
