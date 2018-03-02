package com.jiawei.sericefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHello {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}