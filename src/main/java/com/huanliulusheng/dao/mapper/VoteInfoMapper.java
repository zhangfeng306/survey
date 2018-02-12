package com.huanliulusheng.dao.mapper;

import com.huanliulusheng.entity.VoteInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface VoteInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(VoteInfo record);

    int insertSelective(VoteInfo record);

    int insertVote(@Param("map") Map<String,Object> record);

    VoteInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VoteInfo record);

    int updateByPrimaryKey(VoteInfo record);

}