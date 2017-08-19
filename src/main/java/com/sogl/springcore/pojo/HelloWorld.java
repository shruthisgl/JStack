package com.sogl.springcore.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

	public HelloWorld() {
		// TODO Auto-generated constructor stub
		logger.debug("Constructor called......");
	}

	public void sayHello() {
		logger.debug("sayHello invoked.........");
		logger.info("Hello World");
	}
	
}
