package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Map test(){
        Map data = new HashMap();
        data.put("code",200);
        data.put("msg","this is a demo");
        System.out.printf("kkkkkkkkk");
        System.out.println("000000");
        return data;
    }
}
