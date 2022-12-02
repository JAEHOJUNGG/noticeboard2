package com.example.noticeboard2.controller;

import com.example.noticeboard2.service.UserService;
import com.example.noticeboard2.vo.CommonResponseVo;
import com.example.noticeboard2.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {
    @Autowired
    public UserService userService;

    @RequestMapping({"/", "login"})
    public ModelAndView loginPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/login");
        return mv;
    }

    @RequestMapping("/loginTest")
    @ResponseBody
    public CommonResponseVo loginProcess(UserVo param) {
        CommonResponseVo result = new CommonResponseVo();
        try {
            Boolean r = userService.loginProcess(param);
            result.setSuccess(r);
        } catch (Exception e) {
            System.out.println(e);
            result.setSuccess(false);
        }
        return result;
    }


    @RequestMapping("join")
    public ModelAndView joinPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/join");
        return mv;
    }

    @RequestMapping("/signUp")
    @ResponseBody
    public CommonResponseVo signUpUser(UserVo param) {
        CommonResponseVo result = new CommonResponseVo();
        try {
            Boolean r=userService.joinUser(param);
            result.setSuccess(r);
            result.setMessage("exist user");

        } catch (Exception e) {
            System.out.println(e);
            result.setSuccess(false);
        }
        return result;
        }
    }


