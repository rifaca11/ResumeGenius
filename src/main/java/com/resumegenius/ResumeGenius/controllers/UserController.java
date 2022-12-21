package com.resumegenius.ResumeGenius.controllers;

import com.resumegenius.ResumeGenius.requests.UserRequest;
import com.resumegenius.ResumeGenius.responses.UserResponse;
import com.resumegenius.ResumeGenius.services.UserService;
import com.resumegenius.ResumeGenius.shared.dto.UserDto;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public  String getUser(){
        return "get user methode ";
    }
    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest) throws InvocationTargetException, IllegalAccessException {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties( userDto,userRequest );
        UserDto createUser = userService.createUser(userDto);
        UserResponse userResponse = new UserResponse();
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
