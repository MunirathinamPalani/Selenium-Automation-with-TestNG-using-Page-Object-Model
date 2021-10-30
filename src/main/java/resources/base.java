package resources;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {
	public  WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	String Name=PropertyValues.Browser("browser");
if(Name.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Study\\Driver\\chromedriver.exe");
	driver= new ChromeDriver();
}
else if (Name.equals("firefox"))
{
	 driver= new FirefoxDriver();
}
return driver;
}

/*public void waiting(WebElement) {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(WebElement));
}*/

public String captureScreenshot(WebDriver webdriver, String testCaseName) throws IOException {
		Date d = new Date();
		String FileName = d.toString().replace(":", "_").replace(" ", "_") +testCaseName+ ".png";
		File ss = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("C:\\Study\\ScreenPrint\\" + FileName));
		return FileName;
	}
}
