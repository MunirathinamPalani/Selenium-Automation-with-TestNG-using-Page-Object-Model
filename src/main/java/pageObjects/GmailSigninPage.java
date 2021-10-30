package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailSigninPage {
	
	public WebDriver driver;
	By email=By.xpath("//input[@type='email']");
	
	public GmailSigninPage(WebDriver driver) {	
		this.driver=driver;
	}
	public WebElement Semail()
	{
		return driver.findElement(email);
	}
}