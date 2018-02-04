package com.huanyu.dao.mapper;

import com.huanyu.entity.SystemUserInfo;

public interface SystemUserInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(SystemUserInfo record);

    int insertSelective(SystemUserInfo record);

    SystemUserInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SystemUserInfo record);

    int updateByPrimaryKey(SystemUserInfo record);
}