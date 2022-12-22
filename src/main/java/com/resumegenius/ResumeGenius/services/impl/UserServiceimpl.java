package com.resumegenius.ResumeGenius.services.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.resumegenius.ResumeGenius.entities.UserEntity;
import com.resumegenius.ResumeGenius.repositories.UserRepository;
import com.resumegenius.ResumeGenius.services.UserService;
import com.resumegenius.ResumeGenius.shared.dto.UserDto;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDto createUser(UserDto user) throws InvocationTargetException, IllegalAccessException {
        UserEntity checkUser =  userRepository.findByEmail(user.getEmail());
        if(checkUser!=null) throw new RuntimeException("User already exists");
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userEntity,user);
        userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userEntity.setUserId("userid");
        UserEntity newUser = userRepository.save(userEntity);
        UserDto newUserDto = new UserDto();
        BeanUtils.copyProperties(newUserDto,newUser);

        return newUserDto;
    }

    @Override
    public UserEntity findUserByEmail(String email) throws InvocationTargetException, IllegalAccessException {
        UserEntity userEntity = new UserEntity();
        userEntity =  userRepository.findByEmail(email);
        if (userEntity == null) throw new UsernameNotFoundException("email not found");
        return userEntity;
    }
}
