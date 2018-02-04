package com.huanliulusheng.controller;

import com.huanliulusheng.common.BusinessException;
import com.huanliulusheng.common.bean.ResponseVo;
import com.huanliulusheng.common.bean.VoteBean;
import com.huanliulusheng.common.contants.ControllerContants;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping(value = "/vote")
public class VoteController {

    private Logger logger = Logger.getLogger(VoteController.class);

    //返回jsp视图展示
    @RequestMapping(value = "/question",method = RequestMethod.GET)
    public ModelAndView question() {
        String message = "投票查询";
        logger.info(message + ControllerContants.MESSAGE_START);
        ModelAndView modelAndView = new ModelAndView();
        //设置响应的jsp视图
        modelAndView.setViewName("/question/question");
        logger.info(message + ControllerContants.MESSAGE_END);
        return modelAndView;
    }

    @RequestMapping(value = "/addVote", method = RequestMethod.POST , produces = "application/json;charset=utf-8")
    public @ResponseBody
    String addVote(HttpServletRequest request, @RequestParam Map<String, Object> voteMap) throws Exception {
        String message = "投票";
        logger.info(message + ControllerContants.MESSAGE_START);
        ResponseVo resp = new ResponseVo();
        checekAddVoteArgs(voteMap);



        logger.info(message + ControllerContants.MESSAGE_END);
        return String.valueOf(JSONObject.fromObject(resp));
    }

    /**
     * 参数校验
     * @param voteMap
     */
    private void checekAddVoteArgs(Map<String, Object> voteMap) {
        if(null == voteMap){
            logger.info("传入数据为空");
            throw new BusinessException("数据不合法");
        }

        Set keys= voteMap.keySet();
        if(keys.size() != 9){
            logger.info("传入问题数据不足");
            throw new BusinessException("数据不合法");
        }


    }
}
