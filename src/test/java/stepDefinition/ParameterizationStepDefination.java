package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParameterizationStepDefination {

	WebDriver driver;
	
	@Given("User enters the Orange HRM url in login screen")
	public void user_enters_the_orange_hrm_url_in_login_screen() {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
		
	}
	@When("^Enters the (.*) and (.*)$")
	public void enters_the_username_and_password(String Username, String password) {
	    System.out.println(Username);
	    System.out.println(password);
	    driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(Username);
	    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);
	    
	}
	@When("^Clicks on (.*) login button$")
	public void clicks_on_the_login_button(int count) {
		System.out.println(count);
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	   
	}
	

}



