package Testing.Selenium_Automation;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.SearchPage;
import pageObjects.SearchResults;
import resources.PropertyValues;
import resources.base;
public class TitleValidationTest extends base{
public WebDriver driver;
@BeforeTest
public void initialize() throws IOException
{
	 driver = initializeDriver();
	 String baseurl=PropertyValues.Browser("url");
	 driver.get(baseurl);
}
@Test

public void Page() throws IOException
{
	SearchPage a=new SearchPage(driver);
	a.search().sendKeys("Gmail"+Keys.ENTER);
	SearchResults b=new SearchResults(driver);
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(b.selection()));
	b.selection().click();
	String Title=driver.getTitle();
	if(Title.equals("Gmail: Free, Private & Secure Email | Google Workspace"))
	{
		System.out.println("Test Case 2 Passed");
	}
	else
	{
		System.out.println("Test Case 2 Failed");
	}
	captureScreenshot(driver, "TitleValidationTest");
}
@AfterTest
public void teardown()
{	
	driver.quit();
	
}
}
