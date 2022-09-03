package springDemo1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context =   new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach  theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
         System.out.println(theCoach.getDailyWorkout());
		
		
		System.out.println(theCoach.getDailyFortune());
		
		
		

        System.out.println(theCoach.getEmailAddress());
		
		
		System.out.println(theCoach.getTeam());
		
		
		
		
		
		context.close();

	}

}
