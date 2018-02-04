package com.huanyu.service;


import com.huanyu.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers(Integer userId);
}
