package com.carsspring;

import com.carsspring.manager.UserManager;
import com.carsspring.manager.impl.UserManagerImpl;
import com.carsspring.model.Status;
import com.carsspring.model.User;
import com.carsspring.repository.UserRepository;
import com.carsspring.repository.impl.UserRepositoryImpl;
import com.carsspring.util.GenerateRandomValue;
import com.carsspring.util.MailMail;
import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");


        UserManager userManager = (UserManager) context.getBean("userManagerImpl");
       User user = new User("sakm@mail.ru", "1111", 1000);
        userManager.registerUser(user);
    //    userManager.verify("sakmery95@gmail.com","104B5S");


    }
}
