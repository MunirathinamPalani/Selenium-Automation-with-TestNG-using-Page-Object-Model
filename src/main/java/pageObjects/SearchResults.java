package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResults {

	public WebDriver driver;
	
	By selec=By.xpath("//h3[text()='Gmail - Google']");

	public SearchResults(WebDriver driver) {
	this.driver = driver;
	}
	public WebElement selection()
	{
		return driver.findElement(selec);
	}
	
}
