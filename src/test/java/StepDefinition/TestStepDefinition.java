package StepDefinition;

import Common.UtilityClass;
import Pages.LoginPage;
import Pages.ProductSearch;
import Pages.PurchaseProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestStepDefinition extends UtilityClass{

	//WebDriver driver=null;
	
		@Given("^Load Flipkart$")
		public void load_flipkart() {
		
			SetTestingAttributes();
		    driver.get(getKeyValue(TestingAttributes,"appUrl"));
		    //PropertyConfigurator.configure("reportConfigPath");
		}
		    
		    @When("^Login to Application$")
			public void login_to_application()
			{	
				LoginPage login = new LoginPage(driver);
				login.loginValidUser(getKeyValue(TestingAttributes,"userName"),getKeyValue(TestingAttributes,"password"));
				
			}
		    @Then("^Search Product$")
			public void SearchProduct()
			{
				
				try {
					String item = getKeyValue(TestingAttributes,"item");
					
					ProductSearch productObj = new ProductSearch(driver);
					productObj.SearchProductItem(item);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		    @Then("^Purchase Product$")
			public void BuyProduct()
			{
				
				try {
					//String item = getKeyValue(TestingAttributes,"item");
					
					PurchaseProduct productObj = new PurchaseProduct(driver);
					productObj.PurchaseProductItem();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		    


}



