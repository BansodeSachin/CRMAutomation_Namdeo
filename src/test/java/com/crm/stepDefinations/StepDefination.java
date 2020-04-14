package com.crm.stepDefinations;

import org.testng.Assert;

import com.crm.pageobjects.AddCustomerPage;
import com.crm.pageobjects.CustomerListPage;
import com.crm.ui.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefination extends Base {
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
	}

	@Given("^Click on Add Customer Button to land on Add New Customer Form$")
	public void click_on_Add_Customer_Button_to_land_on_Add_New_Customer_Form() throws Throwable {
	    
		CustomerListPage c = new CustomerListPage(driver);
		
		c.getAddButton().click();
		
		Thread.sleep(2000);
		
	}

	@When("^User enters (.+), (.+) and (.+) and click on submit button$")
	public void userEntersFirstLastEmail(String arg1, String arg2, String arg3) throws Throwable {
	    
		AddCustomerPage ac = new AddCustomerPage(driver);
		
		ac.getFirstName().sendKeys(arg1);
		Thread.sleep(1000);
		
		ac.getLastName().sendKeys(arg2);
		Thread.sleep(1000);
		
		ac.getEmail().sendKeys(arg3);
		Thread.sleep(1000);
		
		ac.getSubmitButton().click();
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