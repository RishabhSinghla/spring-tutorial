package com.rishabh.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//default constructor
	public CricketCoach() {
		System.out.println(">> Inside default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice cricket daily";
	}
	
	@Override
	public String getDailyFortune(){
		return fortuneService.getFortune();	
	}

}
