package com.huanliulusheng.service;

import com.huanliulusheng.entity.VoteReportBean;

import java.util.List;
import java.util.Map;

public interface VoteService {
    /**
     * 投票
     * @param map
     * @return
     */
    public int addVote(Map<String,Object> map);

    List<VoteReportBean> selectQuestionSum(String questionCode);
}
