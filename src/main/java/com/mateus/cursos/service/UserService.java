package com.mateus.cursos.service;

import com.mateus.cursos.dto.UsersDto;
import com.mateus.cursos.model.Users;



public interface UserService {

    Users create(UsersDto dto);

}
