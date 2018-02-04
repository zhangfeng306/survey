package com.huanyu.controller;

import com.huanyu.common.bean.ResponseVo;
import com.huanyu.common.bean.VoteBean;
import com.huanyu.common.contants.ControllerContants;
import com.huanyu.entity.User;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    @RequestMapping(value = "/add", method = RequestMethod.POST , produces = "application/json;charset=utf-8")
    public @ResponseBody
    String vote(HttpServletRequest request, @RequestBody VoteBean voteBean) throws Exception {
        String message = "投票";
        logger.info(message + ControllerContants.MESSAGE_START);
        ResponseVo resp = new ResponseVo();


        logger.info(message + ControllerContants.MESSAGE_END);
        return String.valueOf(JSONObject.fromObject(resp));
    }
}
