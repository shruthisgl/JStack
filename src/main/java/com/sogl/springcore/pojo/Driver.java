package com.sogl.springcore.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	

	private static final Logger logger = LoggerFactory.getLogger(Driver.class);

	public static void main(String[] args) {
		
		logger.debug("Main method invoked");
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:springcore-context.xml");
		HelloWorld helloworld = appCtx.getBean(HelloWorld.class);
		helloworld.sayHello();
	}
}
