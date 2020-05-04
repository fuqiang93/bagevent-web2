package com.fxk.service.impl;

import com.fxk.entity.User;
import com.fxk.entity.repository.UserRepository;
import com.fxk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fuqiang01
 * @date 2020/4/30 22:05
 * @description
 */
@Service
public class UserserviceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserserviceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
