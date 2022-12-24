package com.resumegenius.ResumeGenius.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class StudentEntity extends PersonEntity {

    @Column(nullable = false)
    private String website;

    @Column(nullable = false)
    private String linkedln;

    @Column(nullable = false)
    private String github;

    public String getWebsite() {
        return website;
    }
    public void setFirstName(String website) {
        this.website = website;
    }

    public String getLinkedln() {
        return linkedln;
    }
    public void setLinkedln(String linkedln) {
        this.linkedln = linkedln;
    }

    public String getGithub() {
        return github;
    }
    public void setGithub(String github) {
        this.github = github;
    }





}

