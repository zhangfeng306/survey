package com.huanliulusheng.controller;

import com.huanliulusheng.entity.VoteReportBean;
import com.huanliulusheng.common.contants.ControllerContants;
import com.huanliulusheng.service.VoteService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by zhangfeng on 2018/2/5.
 * 报表控制层
 */
@Controller
@RequestMapping(value = "/report")
public class ReportController {
    private Logger logger = Logger.getLogger(ReportController.class);

    @Autowired
    private VoteService voteService;

    //返回jsp视图展示
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView question() {
        String message = "报表跳转";
        logger.info(message + ControllerContants.MESSAGE_START);
        ModelAndView modelAndView = new ModelAndView();
        List<VoteReportBean> list = voteService.selectQuestionSum("Q1");
        logger.info(JSONArray.fromObject(list).toString());
        //设置响应的jsp视图
        modelAndView.setViewName("/report/reportIndex");
        logger.info(message + ControllerContants.MESSAGE_END);
        return modelAndView;
    }

    //返回jsp视图展示
    @ResponseBody
    @RequestMapping(value = "/q/{questionType}", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public   String q(@PathVariable("questionType") String questionType) {
        String message = "查询数据";
        logger.info(message + ControllerContants.MESSAGE_START);

        List<VoteReportBean> list = voteService.selectQuestionSum(questionType);
        logger.info(JSONArray.fromObject(list).toString());
        //设置响应的jsp视图
        logger.info(message + ControllerContants.MESSAGE_END);
        return JSONArray.fromObject(list).toString();
    }
}
