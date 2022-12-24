package com.resumegenius.ResumeGenius.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@MappedSuperclass
public class PersonEntity implements Serializable {

    private static final long serialVersionUID = 861212087593794753L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String personId;
    @Column(nullable = false, length =50)
    private String firstName;
    @Column(nullable = false , length =50)
    private String lastName;
    @Column(nullable = false , length =50)
    private String adresse;
    @Column(nullable = false)
    private String photo;
    @Column(nullable = false , length =50)
    private String phoneNumber;
    @Column(nullable = false , length =50)
    private Date dateBirth;


    @Column(nullable = false, length =50, unique = true)
    private String email;
    @Column(nullable = false)
    private String encryptedPassword;
    @Column(nullable = true)
    private String emailVerificationToken;
    @Column( nullable = false)
    private Boolean emailVerificationStatus = false ;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateBirth() {
        return dateBirth;
    }
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    public Boolean getEmailVerificationStatus() {
        return emailVerificationStatus;
    }

    public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }
}
