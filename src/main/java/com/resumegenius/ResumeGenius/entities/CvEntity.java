package com.resumegenius.ResumeGenius.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Table(name = "CV")
@NoArgsConstructor
public class CvEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public CvEntity(long id, String status) {
        this.id = id;
        this.status = status;
    }
    @Column(nullable = false , length =50)
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CvEntity cvEntity = (CvEntity) o;
        return id == cvEntity.id && status.equals(cvEntity.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
