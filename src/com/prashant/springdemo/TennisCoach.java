package com.prashant.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService theforFortuneService)
//	{
//		fortuneService = theforFortuneService;
//	}
	
//	@Autowired
//	public TennisCoach(FortuneService theforFortuneService)
//	{
//		fortuneService = theforFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Tennis Coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
