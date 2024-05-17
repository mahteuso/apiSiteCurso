package com.mateus.cursos.mapper;

import com.mateus.cursos.dto.UsersDto;
import com.mateus.cursos.model.SubscriptionType;
import com.mateus.cursos.model.UserType;
import com.mateus.cursos.model.Users;

public class UsersMapper {

    public static Users fromDtoToEntity(UsersDto dto, SubscriptionType subscriptionType, UserType userType){
        return Users.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .cpf(dto.getCpf())
                .dtSubscription(dto.getDtSubscription())
                .dtExpiration(dto.getDtExpiration())
                .subscriptionType(subscriptionType)
                .userType(userType)
                .build();
    }
}
