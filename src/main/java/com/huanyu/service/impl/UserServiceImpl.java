package com.huanyu.service.impl;

import com.huanyu.dao.mapper.UserMapper;
import com.huanyu.entity.User;
import com.huanyu.entity.UserExample;
import com.huanyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers(Integer userId) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if (!"".equals(userId == null ? "" : userId)) {
            criteria.andIdEqualTo(userId);
        }
        return userMapper.selectByExample(example);

    }
}
