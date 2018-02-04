package com.huanliulusheng.dao.mapper;

import com.huanliulusheng.entity.AnswerInfo;

public interface AnswerInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(AnswerInfo record);

    int insertSelective(AnswerInfo record);

    AnswerInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AnswerInfo record);

    int updateByPrimaryKey(AnswerInfo record);
}