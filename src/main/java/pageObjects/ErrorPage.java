package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ErrorPage {
	
	public WebDriver driver;
	By Lear=By.xpath("//a[@target='_blank']");
	
	public ErrorPage(WebDriver driver) {	
		this.driver=driver;
	}
	public WebElement Learn()
	{
		return driver.findElement(Lear);
	}
}
