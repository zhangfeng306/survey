package com.huanliulusheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    public ModelAndView showInfo(@RequestParam(value = "name", required = false, defaultValue = "yth") String name) {
        ModelAndView mv = new ModelAndView("success");
        mv.addObject("message", "Welcome to SpringMVC");
        mv.addObject("name", name);
        return mv;
    }
}
