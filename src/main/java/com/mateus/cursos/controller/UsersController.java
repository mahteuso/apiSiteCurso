package com.mateus.cursos.controller;

import com.mateus.cursos.dto.UsersDto;
import com.mateus.cursos.model.Users;
import com.mateus.cursos.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Users> create(@Valid @RequestBody UsersDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(dto));
    }
}
