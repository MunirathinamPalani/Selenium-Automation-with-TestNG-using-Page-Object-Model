package Testing.Selenium_Automation;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.GmailHomePage;
import pageObjects.GmailSigninPage;
import pageObjects.SearchPage;
import pageObjects.SearchResults;
import resources.PropertyValues;
import resources.base;

public class SigninPageTest extends base{
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
		WebDriverWait wait=new WebDriverWait(driver,20);
		SearchPage a=new SearchPage(driver);
		a.search().sendKeys("Gmail"+Keys.ENTER);
		SearchResults b=new SearchResults(driver);
		wait.until(ExpectedConditions.elementToBeClickable(b.selection()));
		b.selection().click();
		GmailHomePage c=new GmailHomePage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(c.Gpage()));
		c.Gpage().click();
		GmailSigninPage d=new GmailSigninPage(driver);
		d.Semail().sendKeys("muni44priya@gmail.com"+Keys.ENTER);
		//d.Semail().sendKeys(Keys.ENTER);
		String Head=driver.getTitle();
		if(Head.equals("Gmail"))
		{
		System.out.println("Test Case 4 Passed");
		}
		else
		{
		System.out.println("Test Case 4 Failed");
		}
		captureScreenshot(driver, "SigninPageTest");
	}
	@AfterTest
	public void teardown()
	{	
		driver.quit();	
	}
}
