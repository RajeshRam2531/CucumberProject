package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BackgroundExample {
	
	
	
	@Given("user Opens the chrome browser")
	public void user_opens_the_chrome_browser() {
	   
	   System.out.println("Chrome Browser is opened");
	}
	@When("search the cat")
	public void search_the_cat() {
		System.out.println("Cat is  searched");
	}
	
	@When("search the dog")
	public void search_the_dog() {
		System.out.println("dogs is  searched");
	}




}
