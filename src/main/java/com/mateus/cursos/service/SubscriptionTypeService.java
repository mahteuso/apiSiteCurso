package com.mateus.cursos.service;

import com.mateus.cursos.model.SubscriptionType;
import com.mateus.cursos.repository.SubscriptionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionTypeService {

    @Autowired
    private SubscriptionTypeRepository subscriptionTypeRepository;

    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

}
