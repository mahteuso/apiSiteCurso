package com.mateus.cursos.mapper;


import com.mateus.cursos.dto.SubscriptionTypeDto;
import com.mateus.cursos.model.SubscriptionType;

public class SubscriptionTypeMapper {

    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto){
       return SubscriptionType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .accessMonths(dto.getAccessMonths())
                .price(dto.getPrice())
                .productKey(dto.getProductKey())
                .build();
    }

    public static SubscriptionTypeDto fromEntityToDto(SubscriptionType subscriptionType){
        return SubscriptionTypeDto.builder()
                .id(subscriptionType.getId())
                .name(subscriptionType.getName())
                .accessMonths(subscriptionType.getAccessMonths())
                .price(subscriptionType.getPrice())
                .productKey(subscriptionType.getProductKey())
                .build();
    }


}
