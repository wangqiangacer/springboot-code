package com.example.springbootfilterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {


    /**
     * test
     */
    @ResponseBody
    @RequestMapping(value = "/test")
    public String test() {
        return "OK";
    }

}

