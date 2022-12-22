package com.resumegenius.ResumeGenius.services;

import com.resumegenius.ResumeGenius.entities.UserEntity;
import com.resumegenius.ResumeGenius.shared.dto.UserDto;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;


public interface UserService  {

    UserDto createUser(UserDto userDto) throws InvocationTargetException, IllegalAccessException;
    UserEntity findUserByEmail(String email) throws InvocationTargetException, IllegalAccessException;

}
