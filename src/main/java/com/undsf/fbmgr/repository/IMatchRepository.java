package com.undsf.fbmgr.repository;

import com.undsf.fbmgr.entity.Match;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Arathi on 2018/5/8.
 */
@Repository
public interface IMatchRepository extends CrudRepository<Match, Integer> {
}
