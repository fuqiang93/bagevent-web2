package com.fxk.entity.repository;

import com.fxk.entity.User;

import java.util.List;

/**
 * @author fuqiang01
 * @date 2020/4/30 22:07
 * @description
 */
public interface UserRepository {

    Boolean existByNameAndPassword(String name, String password);

    User findByNameAndPassword(String name, String password);

    List<User> findAll();

}
