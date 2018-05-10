package com.undsf.fbmgr.controller;

import com.undsf.fbmgr.message.BaseMessage;
import com.undsf.fbmgr.message.DataMessage;
import com.undsf.fbmgr.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Arathi on 2018/5/9.
 */
public abstract class BaseRestController<E, ID, S extends IBaseService<E, ID>> {
    @Autowired
    private S resSvc;

    public abstract E DeserializeEntity(String json, ID id);

    public String getEntityName() {
        return "对象";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public DataMessage<List<E>> getAll() {
        List<E> entities = resSvc.getAll();
        DataMessage<List<E>> respMsg = new DataMessage<>();
        if (entities != null) {
            respMsg.data = entities;
        }
        else {
            respMsg.code = 1;
            respMsg.message = String.format("获取%s列表失败", getEntityName());
        }
        return respMsg;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public DataMessage<E> getById(@PathVariable("id") ID id) {
        E entity = resSvc.getById(id);
        DataMessage<E> respMsg = new DataMessage<>();
        if (entity != null) {
            respMsg.data = entity;
        }
        else {
            respMsg.code = 1;
            respMsg.message = String.format("%s不存在", getEntityName());
        }
        return respMsg;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public BaseMessage create(@RequestBody String json) {
        E data = DeserializeEntity(json, null);
        E result = resSvc.create(data);
        BaseMessage respMsg = new BaseMessage();
        if (result == null) {
            respMsg.code = 1;
            respMsg.message = String.format("创建%s时发生异常！", getEntityName());
        }
        return respMsg;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public BaseMessage alter(@PathVariable("id") ID id, @RequestBody String json) {
        E data = DeserializeEntity(json, id);
        E result = resSvc.save(data);
        BaseMessage respMsg = new BaseMessage();
        if (result == null) {
            respMsg.code = 1;
            respMsg.message = String.format("更新%s时发生异常！", getEntityName());
        }
        return respMsg;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public BaseMessage remove(@PathVariable("id") ID id) {
        boolean success = resSvc.remove(id);
        BaseMessage respMsg = new BaseMessage(
                success ? 0 : 1,
                success ? "成功" : String.format("删除%s失败！", getEntityName())
        );
        return respMsg;
    }
}
