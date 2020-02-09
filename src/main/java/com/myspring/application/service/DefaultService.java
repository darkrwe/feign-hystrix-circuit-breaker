package com.myspring.application.service;

import com.myspring.application.model.DefaultEntity;
import com.myspring.application.repository.DefaultRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class DefaultService {

    @Autowired
    DefaultRepository defaultRepository;

    private static final Logger logger = LoggerFactory.getLogger(DefaultService.class);

    public DefaultService() {
    }

    public List<DefaultEntity> getAll() {
        try {
            List<DefaultEntity> entities = new ArrayList();
            Iterator<DefaultEntity> iterator = defaultRepository.findAll().iterator();
            while( iterator.hasNext()) {
                entities.add(iterator.next());
            }
            return entities;
        } catch (Exception ex) {
            logger.error("Exception occurred while getting default item by id from database. " + ex.getMessage());
            return null;
        }
    }

    public DefaultEntity getById(long id) {
        try {
            return defaultRepository.findById(id).get();
        } catch (Exception ex) {
            logger.error("Exception occurred while getting default item by id from database. " + ex.getMessage());
            return null;
        }
    }

    public DefaultEntity saveEntityItem(DefaultEntity defaultEntity) {
        try {
            return defaultRepository.save(defaultEntity);
        } catch (Exception ex) {
            logger.error("Exception occurred while saving default item to database. " + ex.getMessage());
            return null;
        }
    }

}
