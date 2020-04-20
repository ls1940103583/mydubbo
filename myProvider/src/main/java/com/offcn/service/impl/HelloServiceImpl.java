package com.offcn.service.impl;

import com.offcn.HelloService;

public class HelloServiceImpl implements HelloService {
    //线上修改代码测试
    @Override
    public String sayHello(String name) {
        return name+":welcome!";
    }
}
