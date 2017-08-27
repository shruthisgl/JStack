package com.sogl.springcore.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public HelloWorld() {
		// TODO Auto-generated constructor stub
		logger.debug("Constructor called......");
	}

	public void sayHello() {
		logger.debug("sayHello invoked.........");
		logger.info("Hello Santosh");
	}

	public void sayHelloToUser() {
		logger.debug("sayHelloToUser invoked.........");
		logger.info("Hello " + user.getFirstName());
	}

}
