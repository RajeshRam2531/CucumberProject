package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksAndTags {
	
	
	

	@Given("Must have age three and above")
	public void must_have_age_three_and_above() {
	    System.out.println("Age must be above 3 and half");
	}
	@When("Childs joins the school")
	public void childs_joins_the_school() {
		
		 System.out.println("Child the joins the school");
	    
	}
	@Then ("Child completes the school")
	public void child_completes_the_school() {
		System.out.println("Child Completes the school");
	    
	}




}
