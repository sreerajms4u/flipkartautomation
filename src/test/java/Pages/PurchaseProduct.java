package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class PurchaseProduct {

	protected static WebDriver driver;
	
	private By Buynow = By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button");
	private By DeliverHere = By.xpath("//*[@id='CNTCTAAEFEE6BE1D342CF96A12E338']/button");
	private By ToPayment = By.xpath("//*[@id='to-payment']/button");
	private By COD = By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[4]/div/div/div[2]/div/label[5]/div[1]");
	private By ConfirmOrder = By.xpath("//*[@id='container']/div/div[2]/div/div[1]/div[4]/div/div/div[2]/div/label[5]/div[2]/div/div/div[3]/form/button/span");
	
	public PurchaseProduct(WebDriver driverObj ){
		driver = driverObj;
	}
	public void PurchaseProductItem() throws InterruptedException
	{		
		WebDriverWait wait = new WebDriverWait(driver, 1000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(Buynow)).click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(DeliverHere)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ToPayment)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(COD)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmOrder)).click();
		
		Reporter.log("TC to test Flipkart Product purchase functioanlity ended", true);
		
	}
}
