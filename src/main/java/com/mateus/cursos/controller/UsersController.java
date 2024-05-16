package com.mateus.cursos.controller;

import com.mateus.cursos.dto.UsersDto;
import com.mateus.cursos.model.Users;
import com.mateus.cursos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Users create(@RequestBody UsersDto dto){
        return userService.create(dto);
    }
}
