package com.huanliulusheng.service;


import com.huanliulusheng.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers(Integer userId);
}
