package com.ali.db.demo.consumer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.ali.dubbo.demo.provider.DemoService;

public class ConsumerAction {
	private DemoService demoService;

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

	public void start() throws Exception {
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            try {
            	String hello = demoService.sayHello("world" + i);
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
        }
	}
}
