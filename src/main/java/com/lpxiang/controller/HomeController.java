package com.lpxiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Tracy on 2016/3/13.
 */
@Controller
@RequestMapping
public class HomeController {

    @RequestMapping( value = "/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
}
