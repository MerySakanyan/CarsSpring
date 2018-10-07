package com.carsspring.model;


import javax.enterprise.inject.Default;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    @NotNull
    private String email;

    // @Column(length = 8)
    @NotNull
    private String password;

    @NotNull
    @DefaultValue(value = "0")
    private int amount;



    // @NotNull
    private String verificationCode;




    public User(String email, String password, int amount) {
        this.email = email;
        this.password = password;
        this.amount = amount;
    }

    public User() {
    }



//    @Enumerated(value = EnumType.ORDINAL)
//    private Status status;
//
//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }


    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }



    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                ", verificationCode=" + verificationCode +
                '}';
    }
}
