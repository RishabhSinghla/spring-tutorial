package com.rishabh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//default constructor
	public TennisCoach() {
		System.out.println("> Inside default constructor");
	}
	
	//define a setter method
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("> Inside setter method");
		fortuneService = theFortuneService;
	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice tennis daily";
	}
	
	@Override
	public String getDailyFortune(){
		return fortuneService.getFortune();	
	}

}
