package com.chencai.springbootshiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "hello spring boot!";
    }

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("name", "zhangsan");
        return "index";
    }
}
