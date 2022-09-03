package springDemo1;

public class CricketCoach implements Coach {
	
	private FortuneService  fortuneService;
	
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside set-email-address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside set-team");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("inside no-argument constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("inside setter method");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise Fast bolwing for 15 min";
	}
	
    public String getDailyFortune() {
		// TODO Auto-generated method stub
		return  fortuneService.getFortune();
	}

}
