package com.ali.dubbo.demo.provider.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ali.dubbo.demo.provider.DemoService;
import com.alibaba.dubbo.rpc.RpcContext;

public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}
