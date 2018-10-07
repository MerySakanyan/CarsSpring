package com.carsspring.repository.impl;

import com.carsspring.model.User;
import com.carsspring.repository.UserRepository;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @org.springframework.transaction.annotation.Transactional
    @Override
    public void addUser(User user) throws IllegalAccessException {
        sessionFactory.getCurrentSession().save(user);
    }

    @org.springframework.transaction.annotation.Transactional
    @Override
    public User getByEmail(String email) {
        Query query = sessionFactory.getCurrentSession().createNativeQuery("Select * From `user` where email = :email").addEntity(User.class);
        query.setParameter("email", email);
        return (User) query.uniqueResult();
    }
}
