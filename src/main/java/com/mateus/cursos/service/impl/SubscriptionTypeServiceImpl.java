package com.mateus.cursos.service.impl;

import com.mateus.cursos.dto.SubscriptionTypeDto;
import com.mateus.cursos.exception.BadRequestException;
import com.mateus.cursos.exception.NotFoundException;
import com.mateus.cursos.mapper.SubscriptionTypeMapper;
import com.mateus.cursos.model.SubscriptionType;
import com.mateus.cursos.repository.SubscriptionTypeRepository;
import com.mateus.cursos.service.SubscriptionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {


    private final SubscriptionTypeRepository subscriptionTypeRepository;

    SubscriptionTypeServiceImpl(SubscriptionTypeRepository subscriptionTypeRepository) {
        this.subscriptionTypeRepository = subscriptionTypeRepository;
    }

    @Override
    public List<SubscriptionType> findAll() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionType findById(Long id) {

        Optional<SubscriptionType> optionalSubscriptionType = subscriptionTypeRepository.findById(id);

        if (optionalSubscriptionType.isEmpty()) {
            throw new NotFoundException("SubscriptionType não encontrado");
        }
        return optionalSubscriptionType.get();
    }

    @Override
    public SubscriptionType create(SubscriptionTypeDto dto) {
        if (dto.getId() != null){
            throw new BadRequestException("Não podemos atualizar!");
        }
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public SubscriptionType update(Long id, SubscriptionTypeDto dto) {
        isIdSubscription(id);
        dto.setId(id);
        return subscriptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public void delete(Long id) {
        isIdSubscription(id);
        subscriptionTypeRepository.delete(subscriptionTypeRepository.findById(id).get());
    }

    private void isIdSubscription(Long id) {
        if (Objects.isNull(findById(id))) {
            throw new NotFoundException("Não encontrado, entre com outro id");
        }
    }
}
