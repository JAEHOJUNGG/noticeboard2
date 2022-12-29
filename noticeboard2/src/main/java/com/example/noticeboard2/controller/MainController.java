package com.example.noticeboard2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }

}
