package com.huanliulusheng.service;

import java.util.Map;

public interface VoteService {
    /**
     * 投票
     * @param map
     * @return
     */
    public int addVote(Map<String,Object> map);
}
