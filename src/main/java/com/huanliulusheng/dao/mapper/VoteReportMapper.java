package com.huanliulusheng.dao.mapper;

import com.huanliulusheng.entity.VoteReportBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VoteReportMapper {

    /**
     * 查询投票汇总数据
     * @param questionCode
     * @return
     */
    List<VoteReportBean> selectQuestionSum(@Param("questionCode") String questionCode);
}