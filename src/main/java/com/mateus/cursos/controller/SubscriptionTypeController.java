package com.mateus.cursos.controller;

import com.mateus.cursos.model.SubscriptionType;
import com.mateus.cursos.service.SubscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {


    @Autowired
    private SubscriptionTypeService subscriptionTypeService;

    @GetMapping
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }


}
