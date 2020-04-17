package stepDefinations;

import com.crm.ui.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStepDefination extends Base{

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		System.out.println("Line 18");
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
	}
	
	
	@Then("^Print Success Message$")
	public void click_on_Add_Customer_Button() throws Throwable {
		
		System.out.println("User Added Successfully...");
	}

	@Then("^close browsers$")
	public void close_browsers() throws Throwable {
	    
		driver.close();
	}
}
