package com.undsf.fbmgr.service.impl;

import com.undsf.fbmgr.service.IBaseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Arathi on 2018/5/9.
 */
public class BaseService<E, ID, R extends CrudRepository<E, ID>>
        implements IBaseService<E, ID> {
    private static Logger logger = LogManager.getLogger(BaseService.class);

    @Autowired
    protected R resRepo;

    @Override
    public E getById(ID id) {
        Optional<E> result = resRepo.findById(id);
        E entity = result.isPresent() ? result.get() : null;
        return entity;
    }

    @Override
    public List<E> getAll() {
        Iterable<E> results = resRepo.findAll();
        List<E> entities = new ArrayList<>();
        for (E result : results) {
            entities.add(result);
        }
        return entities;
    }

    @Override
    public E create(E entity) {
        // TODO 先检查ID
        return save(entity);
    }

    @Override
    public E save(E entity) {
        return resRepo.save(entity);
    }

    @Override
    public boolean remove(ID number) {
        try {
            resRepo.deleteById(number);
            return true;
        }
        catch (Exception ex) {
            logger.warn(ex.getMessage());
        }
        return false;
    }
}
