package com.carsspring.manager;

import com.carsspring.model.User;

public interface UserManager {
    void registerUser(User user) throws IllegalAccessException;
   User getByEmail(String email);
    void verify(String email,String verificationCode) throws IllegalAccessException;
}
