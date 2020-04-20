package com.offcn.service.impl;

import com.offcn.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+":welcome!";
    }
}
