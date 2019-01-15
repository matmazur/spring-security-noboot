package com.matmazur.springSecurityNoboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.put("message", "Hello World!");
        return "index";
    }

}
