package com.undsf.fbmgr.repository;

import com.undsf.fbmgr.entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Arathi on 2018/5/8.
 */
@Repository
public interface IPlayerRepository extends CrudRepository<Player, Integer> {
}
