package springDemo1;

public class TrackCoach implements Coach {
	
	
	private FortuneService  fortuneService;
	
	

	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a 5km";
	}
	
    public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it: "+ fortuneService.getFortune();
	}

}
