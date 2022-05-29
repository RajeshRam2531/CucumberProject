package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsExample {
	
	
	

	@Given("Child not doesnot have age three and above")
	public void child_not_doesnot_have_age_three_and_above() {
		 System.out.println("Child does not have Age above 3 and half");
	}
	@When("Childs joins the school with fake certificate")
	public void childs_joins_the_school_with_fake_certificate() {
		 System.out.println("Child joins the school with fake certificate");
	}
	@Then("Child completes the school with fake certificate")
	public void child_completes_the_school_with_fake_certificate() {
		System.out.println("Child completes the school with fake certificate");
	}
	    




}
