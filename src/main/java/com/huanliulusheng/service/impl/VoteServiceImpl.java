package com.huanliulusheng.service.impl;

import com.huanliulusheng.entity.VoteReportBean;
import com.huanliulusheng.dao.mapper.VoteInfoMapper;
import com.huanliulusheng.dao.mapper.VoteReportMapper;
import com.huanliulusheng.service.VoteService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 投票服务
 */
@Service
public class VoteServiceImpl implements VoteService {

    private Logger logger = Logger.getLogger(VoteServiceImpl.class);
    @Autowired
    private VoteInfoMapper voteInfoMapper;
    @Autowired
    private VoteReportMapper voteReportMapper;


    public int addVote(Map<String, Object> map) {
        logger.info("投票数据入库");
        return voteInfoMapper.insertVote(map);
    }


    /**
     * 查询分组汇总数据
     * @param questionCode
     * @return
     */
    public List<VoteReportBean> selectQuestionSum(String questionCode){
        logger.info("查询分组汇总数据");
        return voteReportMapper.selectQuestionSum(questionCode);
    }
}
