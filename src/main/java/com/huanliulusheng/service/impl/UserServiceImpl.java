package com.huanliulusheng.service.impl;

import com.huanliulusheng.dao.mapper.UserMapper;
import com.huanliulusheng.entity.User;
import com.huanliulusheng.entity.UserExample;
import com.huanliulusheng.service.UserService;
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
