package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
protected static WebDriver driver;
    

	private By usernameBy = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	private By passwordBy = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");
	private By signInSubmitBy = By.xpath("(//button[@type='submit'])[2]");

        public LoginPage(WebDriver wdriver){
	  driver = wdriver;
	}
        
	public void loginValidUser(String userName, String password) {
		
	    driver.findElement(usernameBy).sendKeys(userName);
	    driver.findElement(passwordBy).sendKeys(password);
	    driver.findElement(signInSubmitBy).click();

	}

}
