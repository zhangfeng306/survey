package com.huanyu.dao.mapper;

import com.huanyu.entity.VoteInfo;

public interface VoteInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(VoteInfo record);

    int insertSelective(VoteInfo record);

    VoteInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VoteInfo record);

    int updateByPrimaryKey(VoteInfo record);
}