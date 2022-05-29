package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksExplanation {
	
	@Before
	public void beforeSchool(){
		System.out.println("Child must be born and has birth certificate");
		
	}
	@After
   public void afterSchool(){
	   System.out.println("Child must be have school completion certificate");
	}

}
