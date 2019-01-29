package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//接受页面请求，处理数据，回应
@Controller
public class TestController {
    @RequestMapping("/work")
    @ResponseBody
    public String work(String acc, String pwd) {
        if ("admin".equals(acc)&&"123".equals(pwd)){
            return "success";
        }else {
            return "fail";
        }
    }

    @RequestMapping("/")
    public String index(String acc, String pwd) {
        return "index";
    }
}
