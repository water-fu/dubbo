package com.znn.consumer;

import com.znn.provider.impl.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/fusj/Documents/svncode/fusj/dubbo-service-consumer/WebRoot/WEB-INF/dubbo-consumer.xml");
		context.start();

		DemoService demoService = (DemoService)context.getBean("demoService");
		String hello = demoService.sayHello("Water");
	    System.out.println(hello);
	}
}
