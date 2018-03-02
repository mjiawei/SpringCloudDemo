package com.jiawei.serviceribbon.controller;

import com.jiawei.serviceribbon.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    private String hello(@RequestParam String name){
        return helloService.helloService(name);
    }
}
