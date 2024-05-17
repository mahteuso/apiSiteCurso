package com.mateus.cursos.service;

import com.mateus.cursos.dto.UsersDto;
import com.mateus.cursos.model.Users;
import org.springframework.stereotype.Service;



public interface UserService {

    Users create(UsersDto dto);

}
