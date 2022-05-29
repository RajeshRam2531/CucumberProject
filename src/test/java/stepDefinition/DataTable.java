package stepDefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class DataTable {

	
	
	@Given("User open the browser with Gmail URL")
	public void user_open_the_browser_with_gmail_url() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("Enter the username and password as below")
	public void enter_the_username_and_password_as_below(io.cucumber.datatable.DataTable table) {
		
		// Convert the table to asList and store into the list
		List<String> list=table.asList(String.class);
		String username =list.get(0);
		String password =list.get(1);
		
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
