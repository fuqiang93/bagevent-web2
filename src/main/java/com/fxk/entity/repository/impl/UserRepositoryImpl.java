package com.fxk.entity.repository.impl;

import com.fxk.entity.User;
import com.fxk.entity.repository.UserRepository;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fuqiang01
 * @date 2020/5/4 17:14
 * @description
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public UserRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Boolean existByNameAndPassword(String name, String password) {


        return null;
    }

    @Override
    public User findByNameAndPassword(String name, String password) {
        return null;
    }

    @Override
    public List<User> findAll() {
        Query query = sessionFactory.openSession().createQuery("from User");
        List<User> list = query.list();
        return list;
    }
}
