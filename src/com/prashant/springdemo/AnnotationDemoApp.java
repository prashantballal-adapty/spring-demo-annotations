package com.prashant.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach dc = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(dc.getDailyWorkout());
		System.out.println(dc.getDailyFortune());
		context.close();
	}

}
