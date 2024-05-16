package com.mateus.cursos.service;

import com.mateus.cursos.dto.SubscriptionTypeDto;
import com.mateus.cursos.model.SubscriptionType;

import java.util.List;


public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionTypeDto dto);

    SubscriptionType update(Long id, SubscriptionTypeDto dto);

    void delete(Long id);

}
