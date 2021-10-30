package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GmailHomePage {
	
	public WebDriver driver;
	By gmailpage=By.xpath("//a[text()='Sign in']");
	
	public GmailHomePage(WebDriver driver) {	
		this.driver=driver;
		
	}
	public WebElement Gpage()
	{
		return driver.findElement(gmailpage);
	}
}