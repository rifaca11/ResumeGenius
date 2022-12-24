package com.resumegenius.ResumeGenius.repositories;

import com.resumegenius.ResumeGenius.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity,Long> {
    PersonEntity findByEmail(String email);
}