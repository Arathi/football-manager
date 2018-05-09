package com.undsf.fbmgr.service;

import java.util.List;

/**
 * Created by Arathi on 2018/5/9.
 */
public interface IBaseService<E, ID> {

    E getById(ID id);

    List<E> getAll();

    E create(E entity);

    E save(E entity);

    boolean remove(ID id);
}
