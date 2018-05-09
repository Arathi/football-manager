package com.undsf.fbmgr.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * Created by Arathi on 2018/5/9.
 */
public abstract class JsonConvert {
    private static Logger logger = LogManager.getLogger(JsonConvert.class);

    private static ObjectMapper objMapper;

    public static ObjectMapper GetObjectMapper() {
        if (objMapper == null) {
            objMapper = new ObjectMapper();
        }
        return objMapper;
    }

    public static String SerializeObject(Object entity) {
        String json = null;
        try {
            json = GetObjectMapper().writeValueAsString(entity);
        }
        catch (JsonProcessingException ex) {
            logger.warn(ex.getMessage());
        }
        return json;
    }

    public static <T> T DeserializeObject(String json, Class<T> clazz) {
        T entity = null;
        try {
            entity = GetObjectMapper().readValue(json, clazz);
        }
        catch (IOException ex) {
            logger.warn(ex.getMessage());
        }
        return entity;
    }
}
