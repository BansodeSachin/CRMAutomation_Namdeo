package stepDefinations;

import org.testng.Assert;

import com.crm.pageobjects.AddCustomerPage;
import com.crm.pageobjects.CustomerListPage;
import com.crm.ui.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UpdateCustomerStepDefination extends Base {
	
	@Given("^Click on Update Link for Customer whose id is (\\d+)$")
	public void click_on_Update_Link_for_Customer_whose_id_is(int arg1) throws Throwable {
		CustomerListPage c = new CustomerListPage(driver);
		
		c.getUpdateLink(arg1).click();
		
		Thread.sleep(2000);
	}
	
}