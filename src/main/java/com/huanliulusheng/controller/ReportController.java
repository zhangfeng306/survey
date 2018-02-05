package com.huanliulusheng.controller;

import com.huanliulusheng.common.contants.ControllerContants;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangfeng on 2018/2/5.
 * 报表控制层
 */
@Controller
@RequestMapping(value = "/report")
public class ReportController {
    private Logger logger = Logger.getLogger(ReportController.class);

    //返回jsp视图展示
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView question() {
        String message = "报表跳转";
        logger.info(message + ControllerContants.MESSAGE_START);
        ModelAndView modelAndView = new ModelAndView();
        //设置响应的jsp视图
        modelAndView.setViewName("/report/reportIndex");
        logger.info(message + ControllerContants.MESSAGE_END);
        return modelAndView;
    }
}
