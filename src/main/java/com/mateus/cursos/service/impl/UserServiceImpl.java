package com.mateus.cursos.service.impl;

import com.mateus.cursos.dto.UsersDto;
import com.mateus.cursos.exception.BadRequestException;
import com.mateus.cursos.exception.NotFoundException;
import com.mateus.cursos.mapper.UsersMapper;
import com.mateus.cursos.model.UserType;
import com.mateus.cursos.model.Users;
import com.mateus.cursos.repository.UserTypeRepository;
import com.mateus.cursos.repository.UsersRepository;
import com.mateus.cursos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserTypeRepository userTypeRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users create(UsersDto dto) {

        if (Objects.nonNull(dto.getId())){
            throw new BadRequestException("Id deve ser nulo");
        }

        var userTypeOpt = userTypeRepository.findById(dto.getUserTypeId());

        if (userTypeOpt.isEmpty()){
            throw new NotFoundException("UserTypeId não encontrado");
        }

        UserType userType = userTypeOpt.get();
        Users users = UsersMapper.fromDtoToEntity(dto, null, userType);
        return usersRepository.save(users);
    }

}
