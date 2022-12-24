package com.resumegenius.ResumeGenius.services;

import com.resumegenius.ResumeGenius.entities.PersonEntity;
import com.resumegenius.ResumeGenius.shared.dto.PersonDto;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;


public interface PersonService  {

    PersonDto createPerson(PersonDto userDto) throws InvocationTargetException, IllegalAccessException;
    PersonEntity findPersonByEmail(String email) throws InvocationTargetException, IllegalAccessException;

}