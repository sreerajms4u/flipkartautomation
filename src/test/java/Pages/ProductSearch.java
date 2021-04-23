package Pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.base.Function;

import bsh.Console;

public class ProductSearch{
	
	protected static WebDriver driver;
	private By searchBoxBy = By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
	
	public static String sBookKey = "Selenium";
	private static final String sSearchResult = "//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button";
	private static final String sBookName = "(//a[contains(.,'" + sBookKey + "')])[last()]";
	
	public ProductSearch(WebDriver driverObj ){
		driver = driverObj;
	}
	public void SearchProductItem(String item ) throws InterruptedException
	{		
		Reporter.log("TC to test Flipkart Search functioanlity started", true);
		
		driver.findElement(searchBoxBy).sendKeys(sBookKey);
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sSearchResult)));
		searchResult.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sBookName))).click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

				
		Reporter.log("TC to test Flipkart Search functioanlity ended", true);
		
	}
}