package com.carsspring.manager.impl;

import com.carsspring.manager.UserManager;
import com.carsspring.model.Status;
import com.carsspring.model.User;
import com.carsspring.repository.UserRepository;
import com.carsspring.repository.impl.UserRepositoryImpl;
import com.carsspring.util.GenerateRandomValue;
import com.carsspring.util.MailMail;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserManagerImpl implements UserManager {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MailMail mailMail;

    public void registerUser(User user) {
        String code= GenerateRandomValue.generate();
//        mailMail.sendMail("sakmery95@gmail.com",
//                user.getEmail(),
//                "Your verification code",
//              code);
//
        user.setVerificationCode(code);

     //   user.setStatus(Status.Unverified);
        try {
            userRepository.addUser(user);
        }catch (Exception e){
            System.out.println("erooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooor");
        }


    }

    @Override
    public User getByEmail(String email) {
        return userRepository.getByEmail(email);
    }

    @Override
    @Transactional
    public void verify(String email, String verificationCode) throws IllegalAccessException {
        if (userRepository.getByEmail(email).getVerificationCode().equals(verificationCode)){
         //   userRepository.getByEmail(email).setStatus(Status.Active);
        }else throw  new IllegalAccessException("errrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrror");

    }


}
