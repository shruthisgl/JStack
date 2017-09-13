package com.sogl.springcore;

import java.util.Arrays;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sogl.springcore.pojo.HelloWorld;
import com.sogl.springcore.pojo.User;

public class Driver {
	

	private static final Logger logger = LoggerFactory.getLogger(Driver.class);

	public static void main(String[] args) {
		
		logger.debug("Main method invoked");
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:springcore-context.xml");
		
		System.out.println(Arrays.toString(appCtx.getBeanDefinitionNames()));;
		HelloWorld helloworld = appCtx.getBean(HelloWorld.class);
		Calendar calendar = appCtx.getBean(Calendar.class);
		helloworld.sayHelloToUser();;
		logger.info(calendar.getTime().toString());
	}
}
