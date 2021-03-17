package com.rg.demo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService  = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 miniutes on batting practice";
	}
	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
}
