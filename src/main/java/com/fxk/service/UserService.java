package com.fxk.service;

import com.fxk.entity.User;

import java.util.List;

/**
 * @author fuqiang01
 * @date 2020/4/30 22:05
 * @description
 */
public interface UserService {

    List<User> findAllUser();
}
