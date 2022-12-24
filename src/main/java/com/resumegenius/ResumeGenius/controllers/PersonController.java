package com.resumegenius.ResumeGenius.controllers;

import com.resumegenius.ResumeGenius.requests.PersonRequest;
import com.resumegenius.ResumeGenius.responses.PersonResponse;
import com.resumegenius.ResumeGenius.services.PersonService;
import com.resumegenius.ResumeGenius.shared.dto.PersonDto;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/users")
public class PersonController {
    @Autowired
    PersonService userService;
    @GetMapping
    public  String getUser(){
        return "get user methode ";
    }
    @PostMapping
    public PersonResponse createUser(@RequestBody PersonRequest userRequest) throws InvocationTargetException, IllegalAccessException {
        PersonDto userDto = new PersonDto();
        BeanUtils.copyProperties( userDto,userRequest );
        PersonDto createUser = userService.createUser(userDto);
        PersonResponse userResponse = new PersonResponse();
        BeanUtils.copyProperties( userResponse,createUser );
        return userResponse;
    }
    @PutMapping
    public  String updateUser(){
        return "createUser methode ";
    }
    @DeleteMapping // pascalCase
    public  String deleteUser(){
        return "deleteUser methode ";
    }
}