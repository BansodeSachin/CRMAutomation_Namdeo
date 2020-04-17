package stepDefinations;

import org.testng.Assert;

import com.crm.pageobjects.AddCustomerPage;
import com.crm.pageobjects.CustomerListPage;
import com.crm.ui.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DeleteCustomerStepDefination extends Base {
	
	@Given("^Click on Delete Link for customer whose id is (\\d+)$")
	public void click_on_Delete_Link_for_customer_whose_id_is(int arg1) throws Throwable {
	    
		CustomerListPage c = new CustomerListPage(driver);
		
		c.getDeleteLink(6).click();
		
		Thread.sleep(2000);
		
		System.out.println("CRM UI Delete Link Testing Started...");
		
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
	}


}