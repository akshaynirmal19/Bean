package springDemo1;

public class BaseBallCoach implements Coach {
	
	
	
	private FortuneService  fortuneService;
	
	
	public BaseBallCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spent 30 minute on Ground";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
