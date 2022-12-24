package com.resumegenius.ResumeGenius.entities;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Langugae")
@NoArgsConstructor
public class LanguageEntity implements Serializable {


    public LanguageEntity(long id,String languageId, String name, String level) {
        this.id = id;
        this.languageId = languageId;
        this.name = name;
        this.level = level;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String languageId;

    @Column(nullable = false , length =50)
    private String name;

    @Column(nullable = false , length =50)
    private String level;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLanguageId() {
        return languageId;
    }
    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguageEntity that = (LanguageEntity) o;
        return id == that.id && languageId.equals(that.languageId) && name.equals(that.name) && level.equals(that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,languageId, name, level);
    }


}
