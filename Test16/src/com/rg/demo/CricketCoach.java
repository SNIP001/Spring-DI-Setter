package com.rg.demo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	//create no-arg constructor
	 public CricketCoach() {
		 System.out.println("cricket coach: no arg constructor");
	}
	 //our setter method
	 public void setFortuneService(FortuneService fortuneService) {
		 	System.out.println("cricket coach: inside our setter method");
			this.fortuneService = fortuneService;
		}
	 
	 
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 10 min";
	}

	@Override
	public String getDailyFortune() {
		return "have a good day";
	}

}
