package com.carsspring.repository;

import com.carsspring.model.User;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;


public interface UserRepository  {
    void addUser(User user) throws IllegalAccessException;
    User getByEmail(String email);
}
