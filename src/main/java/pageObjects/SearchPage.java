package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SearchPage {
	
	public WebDriver driver;
	By sear=By.name("q");

	public SearchPage(WebDriver driver) {
	this.driver = driver;
	}
	public WebElement search()
	{
		return driver.findElement(sear);
	}
}