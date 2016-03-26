package com.znn.provider;

import com.znn.provider.impl.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello Dubbo,Hello " + name;
	}

}
