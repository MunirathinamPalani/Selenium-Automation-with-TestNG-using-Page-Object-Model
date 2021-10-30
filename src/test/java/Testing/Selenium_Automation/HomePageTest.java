package Testing.Selenium_Automation;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.SearchPage;
import resources.PropertyValues;
import resources.base;

public class HomePageTest extends base{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
		 String baseurl=PropertyValues.Browser("url");
		 driver.get(baseurl);
	}
	@Test
	
	public void basePage() throws IOException
	{
		SearchPage a=new SearchPage(driver);
		a.search().sendKeys("Gmail"+Keys.ENTER);		
		System.out.println("Test case 1 Passed");
		captureScreenshot(driver, "HomePageTest");
	}

	@AfterTest
	public void teardown()
	{	
		driver.quit();
		
	}
}
