package com.bai.service;

import com.bai.entity.User;

/**
 * @author bai
 * @create 2020-09-16-21:16
 */
public interface UserService {
    User checkUser(String username, String password);
}
