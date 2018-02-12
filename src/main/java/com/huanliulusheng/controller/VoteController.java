package com.huanliulusheng.controller;

import com.huanliulusheng.common.BusinessException;
import com.huanliulusheng.common.bean.ResponseVo;
import com.huanliulusheng.common.contants.ControllerContants;
import com.huanliulusheng.service.VoteService;
import com.huanliulusheng.utils.UUIDUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@RequestMapping(value = "/vote")
public class VoteController {

    private Logger logger = Logger.getLogger(VoteController.class);

    @Autowired
    private VoteService voteService;

    //返回jsp视图展示
    @RequestMapping(value = "/question", method = RequestMethod.GET)
    public ModelAndView question() {
        String message = "投票跳转";
        logger.info(message + ControllerContants.MESSAGE_START);
        ModelAndView modelAndView = new ModelAndView();
        //设置响应的jsp视图
        modelAndView.setViewName("/question/question");
        logger.info(message + ControllerContants.MESSAGE_END);
        return modelAndView;
    }

    @RequestMapping(value = "/addVote", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public ModelAndView addVote(HttpServletRequest request, @RequestParam Map<String, Object> voteMap) {
        String message = "投票";
        logger.info(message + ControllerContants.MESSAGE_START);
        ResponseVo resp = new ResponseVo();
        checekAddVoteArgs(voteMap);

        Map<String, Object> sql;
        List<String> answerCodes;
        String batchNo;
        int sumScore;
        ModelAndView modelAndView = new ModelAndView();
        try {
            sql = new HashMap<String, Object>();
            answerCodes = new ArrayList<String>();
            batchNo = UUIDUtils.generateUUID32();
            sumScore = 0;
            for (Map.Entry<String, Object> entry : voteMap.entrySet()) {
                logger.info("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                String key = entry.getKey().toLowerCase();//先统一转为小写
                String value = (String) entry.getValue();
                key = key.replace("question", "Q");

                String answerCode = key + "A" + value.toString();
                logger.info("取值：" + answerCode);
                answerCodes.add(answerCode);
                //汇总分数
                sumScore += Integer.valueOf(value.trim());
            }
            if (answerCodes.size() != 9) {
                logger.info("投票数据不完整");
                throw new BusinessException("投票数据不完整");
            }

            sql.put("batchNo", batchNo);
            sql.put("anserCodes", answerCodes);
            voteService.addVote(sql);
            if (sumScore <= 32) {
                modelAndView.setViewName("result/result4");

            } else if (sumScore > 32 && sumScore <= 44) {
                modelAndView.setViewName("result/result3");
            } else if (sumScore > 44 && sumScore <= 57) {
                modelAndView.setViewName("result/result2");
            } else if (sumScore > 57 && sumScore <= 67) {
                modelAndView.setViewName("result/result1");
            }

        } catch (Exception e) {
            logger.error("增加投票信息异常：", e);
            logger.info(message + ControllerContants.MESSAGE_END);
            throw new BusinessException("增加投票信息异常");
        }

        logger.info(message + ControllerContants.MESSAGE_END);
        return modelAndView;
    }

    /**
     * 参数校验
     *
     * @param voteMap
     */
    private void checekAddVoteArgs(Map<String, Object> voteMap) {
        if (null == voteMap) {
            logger.info("传入数据为空");
            throw new BusinessException("数据不合法");
        }

        Set keys = voteMap.keySet();
        if (keys.size() != 9) {
            logger.info("传入问题数据不足");
            throw new BusinessException("数据不合法");
        }


    }
}
