package com.myspring.application.controller;


import com.myspring.application.model.DefaultEntity;
import com.myspring.application.service.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/default-item")
public class DefaultController {

    @Autowired
    private DefaultService defaultService;

    @GetMapping("/all")
    public ResponseEntity<List<DefaultEntity>> getAllEntityItems() {

        List<DefaultEntity> defaultEntities = defaultService.getAll();

        if (defaultEntities.isEmpty()) {
            return new ResponseEntity("Not Found any default entity Item.", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(defaultEntities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DefaultEntity> getEntityItemById(@PathVariable("id") int id) {

        DefaultEntity defaultEntity = defaultService.getById(id);

        if (defaultEntity == null) {
            return new ResponseEntity("Not Found default entity Item.", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(defaultEntity, HttpStatus.OK);
    }


    @PostMapping("/")
    public ResponseEntity<DefaultEntity> insertEntity(@RequestBody DefaultEntity defaultEntity) {

        if (defaultEntity != null) {
            DefaultEntity insertedDefaultEntity = defaultService.saveEntityItem(defaultEntity);
            return new ResponseEntity(insertedDefaultEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity("Invalid default entity item.", HttpStatus.BAD_REQUEST);
        }

    }

}
