package com.resumegenius.ResumeGenius.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;


@Entity
@MappedSuperclass
public class FieldsEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fieldId;
    @Column(nullable = false, length =50)
    private String name;
    @Column(nullable = false , length =50)
    private Date startDate;

    @Column(nullable = false , length =50)
    private Date endDate;
    @Column(nullable = false , length =50)
    private String website;
    @Column(nullable = false)
    private String summary;
    @Column(nullable = false , length =50)
    private String tech;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String setFieldId() {
        return fieldId;
    }
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {this.endDate = endDate;}

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String setTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

}
